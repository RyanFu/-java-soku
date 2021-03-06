package com.youku.soku.pos_analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.torque.util.BasePeer;

import com.workingdogs.village.Record;
import com.youku.search.util.MyUtil;

public class CategoryMap {

	static Log logger = LogFactory.getLog(CategoryMap.class);

	public static class Category {
		public static final String T_VIDEO_CATEGORY = "VIDEO_CATEGORY";
		public static final String T_FOLDER_CATEGORY = "FOLDER_CATEGORY";
		public static final String T_PK = "PK";
		public static final String T_CLUB_CATEGORY = "CLUB_CATEGORY";
		public static final String T_VIDEO_INDEX = "VIDEO_INDEX";

		public int id;
		public String name;
		public String type;

		public Category() {
		}

		public Category(int id, String name, String type) {
			this.id = id;
			this.name = name;
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

		public int getId() {
			return id;
		}

		public static Category video(int id, String name) {
			return new Category(id, name, T_VIDEO_CATEGORY);
		}

		public static Category folder(int id, String name) {
			return new Category(id, name, T_FOLDER_CATEGORY);
		}

		public static Category pk(int id, String name) {
			return new Category(id, name, T_PK);
		}
	}

	public final List<Category> list = new ArrayList<Category>();// 所有数据
	public final Map<Integer, Category> map = new HashMap<Integer, Category>();// 所有数据
	public final List<Category> videoList = new ArrayList<Category>();// 视频分类
	public final List<Category> folderList = new ArrayList<Category>();// 专辑分类

	private static CategoryMap instance;

	private static boolean initFromDababase = false;// 从数据库加载分类信息
	private static final long LoadFromDababasePeriod = 1000 * 60 * 30;// 30分钟

//	static {
//		if (initFromDababase) {
//			new Timer().schedule(new LoadFromDatabaseTimerTask(),
//					LoadFromDababasePeriod, LoadFromDababasePeriod);
//		}
//	}

	public synchronized static CategoryMap getInstance() {

		if (instance == null) {
			CategoryMap categoryMap = getFreshCategoryMap();
			instance = categoryMap;
		}

		return instance;
	}

	public String getNameById(int id) {
		if (map.containsKey(id)) {
			return map.get(id).name;
		}
		return "";
	}

	public String getTypeById(int id) {
		if (map.containsKey(id)) {
			return map.get(id).type;
		}
		return "";
	}

	private static CategoryMap getFreshCategoryMap() {
		CategoryMap categoryMap = new CategoryMap();
		categoryMap.init();
		return categoryMap;
	}

	private void init() {

		// 2种初始化方式
		if (initFromDababase) {
			logger.info("加载分类信息的方式：读数据库，周期为：" + LoadFromDababasePeriod);

			init_cate_list_from_database();

		} else {
			logger.info("加载分类信息的方式：硬编码");
			init_list_custom();
		}

		// 初始化其他
		for (Category category : list) {
			map.put(category.id, category);

			if (Category.T_VIDEO_CATEGORY.equalsIgnoreCase(category.type)) {
				videoList.add(category);
			}

			if (Category.T_FOLDER_CATEGORY.equalsIgnoreCase(category.type)) {
				folderList.add(category);
			}
		}
	}

	private void init_cate_list_from_database() {

		// 初始化list
		final String sql = "SELECT cate_id, cate_name, cate_type from t_cate_info WHERE cate_type = 'VIDEO_CATEGORY' or cate_type = 'FOLDER_CATEGORY' ORDER BY cate_order, cate_id ASC";

		try {
			List<Record> rs = BasePeer.executeQuery(sql,"category") ;
			for(Record r:rs){
				int id = r.getValue("cate_id").asInt();
				String cate_name = MyUtil.getString(r.getValue("cate_name").asString().trim());
				String cate_type = MyUtil.getString(r.getValue("cate_type").asString().trim());
				
				logger.info("===="+r.getValue("cate_name").asString().trim());
				logger.info("----"+cate_name);
				System.out.println(cate_name.equalsIgnoreCase("广告"));
				
				
				list.add(new Category(id, cate_name, cate_type));
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void init_list_custom() {

		// 初始化list
		list.add(Category.video(91, "资讯"));
		list.add(Category.video(92, "原创"));
		list.add(Category.video(97, "电视剧"));
		list.add(Category.video(96, "电影"));
		list.add(Category.video(98, "体育"));
		list.add(Category.video(95, "音乐"));
		list.add(Category.video(99, "游戏"));
		list.add(Category.video(100, "动漫"));
		list.add(Category.video(89, "时尚"));
		list.add(Category.video(90, "母婴"));
		list.add(Category.video(104, "汽车"));
		list.add(Category.video(88, "旅游"));
		list.add(Category.video(105, "科技"));
		list.add(Category.video(103, "生活"));
		list.add(Category.video(94, "搞笑"));
		list.add(Category.video(102, "广告"));
		list.add(Category.video(87, "教育"));
		list.add(Category.video(85, "综艺"));
		list.add(Category.video(86, "娱乐"));

		list.add(Category.folder(123, "热点"));
		list.add(Category.folder(124, "原创"));
		list.add(Category.folder(128, "电影"));
		list.add(Category.folder(129, "电视剧"));
		list.add(Category.folder(130, "体育"));
		list.add(Category.folder(127, "音乐"));
		list.add(Category.folder(131, "游戏"));
		list.add(Category.folder(132, "动漫"));
		list.add(Category.folder(125, "女性"));
		list.add(Category.folder(126, "搞笑"));
		list.add(Category.folder(133, "自拍"));
		list.add(Category.folder(134, "广告"));
		list.add(Category.folder(135, "生活"));
		list.add(Category.folder(136, "汽车"));
		list.add(Category.folder(137, "科教"));
		list.add(Category.folder(138, "其他"));
	}

	static class LoadFromDatabaseTimerTask extends TimerTask {
		@Override
		public void run() {
			try {
				logger.info("TimerTask从数据库加载分类信息: 开始执行...");

				instance = getFreshCategoryMap();

				logger.info("TimerTask从数据库加载分类信息: 执行完毕");
			} catch (Exception e) {
				logger.error("TimerTask从数据库加载分类信息: 执行发生异常", e);
			}
		}
	}
}

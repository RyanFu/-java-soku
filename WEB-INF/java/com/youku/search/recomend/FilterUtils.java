package com.youku.search.recomend;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.youku.soku.library.Utils;
import com.youku.soku.manage.shield.ShieldInfo;
import com.youku.soku.shield.Filter;

public class FilterUtils {
	private static Pattern pattern;
	
	public static void list2Regex(List<String> list){
		if(null==list||list.size()<1){
			System.err.println("null filter words prepared.");
			pattern = null;
			return;
		}
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<list.size();i++){
			if(i!=0)sb.append("|");
			sb.append(list.get(i));
		}
		pattern = Pattern.compile(sb.toString());
	}
	
	public static boolean isMatch(String keyword){
		if(null==keyword)return false;
		if(null==pattern)return false;
		else{
			Matcher matcher  = pattern.matcher(keyword);
			if(matcher.find())
			System.out.println(matcher.group());
			return matcher.find();
		}
	}
	
	/**
	 * 是否匹配过滤词 true:过滤 false:不过滤
	 * @param keyword
	 * @return
	 */
	public static boolean isFilter(String keyword){
		if(StringUtils.isBlank(keyword)) return true;
		ShieldInfo s = Filter.getInstance().isShieldWord(keyword, Filter.Source.youku);
		if(null!=s)
			return s.isMatched();
//		System.out.println("屏蔽系统返回null，keyword:"+keyword);
		return false;
	}
	
	public static void main(String[] args) {
		String stop_words = "08宪章, 08宪脏, 18以下, 18岁禁, 3级, av, av女优, a片, b样, fuck, h动漫, nba, r级, av, av女郎, a级片, b样, fa轮, fuck, gay, huang, h动漫, mei女, moviefever, sex, sexy, tvb, xing, 一个强制视频软件, 一夜性, 一夜情, 一夜情俱乐部, 一柱擎天, 丁字, 丁字裤, 丁香成人, 三及, 三及电影, 三級, 三级, 三级片, 三集, 三集片, 三鹿, 上访, 下体, 下阴, 丝袜, 丝袜堵嘴, 两性, 中出片, 中国成人, 中国猪, 乔丹, 乱执法, 乳交, 乳交片, 乳头, 乳房, 二b, 二奶, 二奶大奖赛, 亚洲图区, 交友, 交易, 人体, 人体模特翘臀, 人体艺术, 他妈的, 伦理, 体位, 作爱, 你妈的, 侮辱, 做爱, 做鸡, 偷情, 偷拍, 偷拍发廊服务, 偷拍美女, 偷拍走光, 偷排, 偷窥, 偷窥无罪, 偷窺, 傻b, 免费性爱电影, 免费激情, 內衣, 全裸, 全裸片断, 公安打击假, 公牛队, 六合彩, 兽性, 兽欲, 兽精液, 内衣, 写真, 冰毒, 凌辱, 凯尔特人, 制服诱惑, 包皮, 十八摸, 午夜激情, 卖b, 卖淫, 南部非洲, 去你妈的, 变态, 口交, 口爆片, 另类图区, 叫床, 同性恋, 吗比, 周末同床, 呻吟, 哈批, 城管, 堵嘴, 处女, 复活, 大奶, 大波, 大胸, 太阳队, 头拍, 女优, 女優, 女同, 女犯, 奶子, 好色男女, 如房, 妈b, 妈b, 妈批, 妓淫, 威视股份, 娘的, 婊子, 婚外初夜, 嫖娼, 孙悦, 学生妹, 學生妹, 密的地址, 射精, 小仓优子, 小电影, 小穴, 小鸡鸡, 少儿不宜, 少儿不易, 少女, 少女脱衣陪酒, 少妇, 尻, 屁眼, 屁股, 屄, 屙民, 巨乳, 干你, 干你老母, 干死你, 幼女, 幼幼, 幼齿, 床戏, 应召, 底裤, 开平, 引诱, 张钰, 弹药, 强奸, 强奸偷窥, 强奸少妇, 强暴, 很黄很暴力, 快乐到死, 性, 性交, 性伦理, 性保健, 性喜剧, 性姿势, 性幽默, 性广告, 性感美女, 性技巧, 性教程, 性教育, 性游戏, 性爱, 性片, 性片段, 性片电影, 性生活, 性电影, 性知识, 性网络, 性虐, 性虐待, 性行为, 性骚扰, 恋足, 恶心, 恶搞, 恶搞春晚, 情, 情欲, 情色, 情色片, 情色电影, 想爽, 想看x片到, 成人, 成人动漫, 成人性爱电影, 成人游戏, 成人电影, 成人聊天室, 我操, 我日, 我草, 手术, 手淫, 打炮, 打飞机, 扫黄, 投拍, 抢劫, 护士, 招妓, 按摩棒, 挑逗, 换妻, 接吻, 援交, 援交妹, 援助交际, 摇屁屁, 摸阴, 操他, 操你, 操你妈, 操日, 操比, 操蛋, 操逼, 操雅阁女, 支那, 放荡, 断背, 无码, 日不够, 日你, 日本av, 日本av, 日本变态, 日本妹, 日死你, 日翻皮, 日逼, 明星露点, 易建联, 春光, 是个b, 晚娘, 暴乱, 暴光, 暴光出艳照门视频, 暴力, 有漏, 杀人, 杀比, 杀生, 杨帆, 极度诱惑, 枪支, 校园暴力, 梦遗, 检验处女, 欧美图区, 欲性, 欲火, 欲火焚身, 正面全裸, 毒品, 毛片, 江泽民, 没女, 波霸, 淫, 淫书, 淫亂, 淫叫, 淫图, 淫声浪语, 淫女, 淫奴, 淫妞, 淫妹, 淫妹妹发情, 淫姐, 淫娃, 淫情, 淫母, 淫水, 淫流, 淫浪, 淫液, 淫秽, 淫穴, 淫糜, 淫色, 淫荡, 淫荡奸淫, 淫荡护士, 淫蜜, 淫贱, 淫魔, 游行, 漏点, 漏胸, 漏臀, 激情, 激情戏, 激情爽片, 激情片段, 激情疯狂, 激情美女, 激情自拍, 激情艳舞, 激情诱惑, 激片段, 激请, 火热少妇, 炼功, 烂比, 烂货, 烂逼, 烈性狂爱, 热站政论网, 熟女, 爆乳, 爆光, 爱抚试精, 爽死我了, 狂就干你, 狂操, 狗不如, 狗卵子, 狗娘, 狗屎, 狗操, 猪操, 猪聋畸, 王八, 甜性涩爱, 男同, 畜生, 相怀珠, 真善忍, 睾丸, 示威, 私处, 科比, 精子, 級片, 素人片, 纳米比亚, 美乳, 美女, 美女出浴, 美女激, 美女激情, 美女热舞, 美女脱光, 美女脱衣, 美女自拍, 美女艳舞, 美女被偷怕, 美女裸体, 美女诱惑, 美女露点, 美脚, 美腿, 美臀, 老师错了, 联系qq, 肉棍, 肉棒, 肉洞, 肛交, 肛门, 胡海峰, 脚镣, 脱衣, 脱衣服, 脱衣舞, 脱衣舞自, 脱衣舞自拍, 自慰, 自摸, 自杀, 自虐, 舔奶, 舔脚, 色动漫, 色即是空, 色性, 色性质量, 色情, 色情五月天, 色情俱乐部, 色情片, 色戒, 色既是空, 色清, 色清动漫, 色清动画, 色清片, 色清电影, 色清视频, 色游戏, 色片, 色狼, 色电影, 色男, 色系列, 色色, 色诱, 色请, 艳情, 艳照门, 蒙古独, 蒙独, 虐待, 虐恋, 血腥, 行贿调查, 被操, 裙下, 裸体, 裸奔, 裸女, 裸聊, 裸舞, 视频聊天, 詹姆斯, 誘惑, 让你爽, 诈骗, 诱人, 诱奸, 诱惑, 诱捕, 诱色, 调情, 贯通两极法, 贱人, 贱比, 贱货, 贱逼, 赌博, 赤化, 赤匪, 赤裸, 走光, 超级诱惑, 跟我上床, 轮奸, 辣舞翘臀, 辱骂, 迷奸, 迷药, 透明内衣, 逼样, 逼毛, 遗精, 郑少东, 金瓶梅, 钢管舞, 阝月, 阴唇, 阴毛, 阴水, 阴茎, 阴蒂, 阴道, 阴部, 限制级, 隐私, 集会, 零八xian章, 雷人春晚, 露乳, 露屁股, 露底, 露点, 露胸, 露臀, 青天白日旗, 非礼, 韩宫窥春, 颜射, 风骚, 饭岛爱, 马岗, 骑李湘, 骚乳, 骚扰, 高潮, 高跟, 魔术队, 鸡8, 鸡八, 鸡奸, 鸡巴, 鸡情, 麻古, 黄片, 黄碟风云, 黄网, 黄色, 黑丝袜, 龟头";
		
		List<String> list = Utils.parseStr2List(stop_words, ",");
		list2Regex(list);
		System.out.println(isMatch("爱情"));
	}
}

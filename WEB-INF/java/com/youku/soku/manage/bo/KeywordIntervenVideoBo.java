package com.youku.soku.manage.bo;

import java.util.Date;

import org.apache.commons.lang.ObjectUtils;

/**
 * Video
 * 
 * This class was autogenerated by Torque on:
 * 
 * [Wed Jan 06 16:03:01 CST 2010]
 * 
 * You should not use this class directly. It should not even be extended all
 * references should be to Video
 */
public class KeywordIntervenVideoBo {
	/** Serial version */
	private static final long serialVersionUID = 1262764981171L;

	/** The value for the videoId field */
	private int videoId;

	/** The value for the name field */
	private String name;

	/** The value for the url field */
	private String url;

	/** The value for the videoLength field */
	private String videoLength;

	/** The value for the source field */
	private String source;

	/** The value for the category field */
	private String category;

	/** The value for the indexType field */
	private int indexType;

	/** The value for the sort field */
	private int sort;

	/** The value for the createDate field */
	private Date createDate;

	/** The value for the modifyDate field */
	private Date modifyDate;
	
	/** The value for the expiredDate field */
	private String expiredStrDate;

	public String getExpiredStrDate() {
		return expiredStrDate;
	}

	public void setExpiredStrDate(String expiredDate) {
		this.expiredStrDate = expiredDate;
	}

	/** The value for the picturePath field */
	private String picturePath;

	/** The value for the itemId field */
	private int keywordId;
	
	/** The value for the item name */
	private String itemName;
	

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * Get the VideoId
	 * 
	 * @return int
	 */
	public int getVideoId() {
		return videoId;
	}

	/**
	 * Set the value of VideoId
	 * 
	 * @param v
	 *            new value
	 */
	public void setVideoId(int v) {

		if (this.videoId != v) {
			this.videoId = v;

		}

	}

	/**
	 * Get the Name
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the value of Name
	 * 
	 * @param v
	 *            new value
	 */
	public void setName(String v) {

		if (!ObjectUtils.equals(this.name, v)) {
			this.name = v;

		}

	}

	/**
	 * Get the Url
	 * 
	 * @return String
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the value of Url
	 * 
	 * @param v
	 *            new value
	 */
	public void setUrl(String v) {

		if (!ObjectUtils.equals(this.url, v)) {
			this.url = v;

		}

	}

	/**
	 * Get the VideoLength
	 * 
	 * @return int
	 */
	public String getVideoLength() {
		return videoLength;
	}

	/**
	 * Set the value of VideoLength
	 * 
	 * @param v
	 *            new value
	 */
	public void setVideoLength(String v) {
		this.videoLength = v;
	}

	/**
	 * Get the Source
	 * 
	 * @return String
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Set the value of Source
	 * 
	 * @param v
	 *            new value
	 */
	public void setSource(String v) {

		if (!ObjectUtils.equals(this.source, v)) {
			this.source = v;

		}

	}

	/**
	 * Get the Category
	 * 
	 * @return String
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Set the value of Category
	 * 
	 * @param v
	 *            new value
	 */
	public void setCategory(String v) {

		if (!ObjectUtils.equals(this.category, v)) {
			this.category = v;

		}

	}

	/**
	 * Get the IndexType
	 * 
	 * @return int
	 */
	public int getIndexType() {
		return indexType;
	}

	/**
	 * Set the value of IndexType
	 * 
	 * @param v
	 *            new value
	 */
	public void setIndexType(int v) {

		if (this.indexType != v) {
			this.indexType = v;

		}

	}

	/**
	 * Get the Sort
	 * 
	 * @return int
	 */
	public int getSort() {
		return sort;
	}

	/**
	 * Set the value of Sort
	 * 
	 * @param v
	 *            new value
	 */
	public void setSort(int v) {

		if (this.sort != v) {
			this.sort = v;

		}

	}

	/**
	 * Get the CreateDate
	 * 
	 * @return Date
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Set the value of CreateDate
	 * 
	 * @param v
	 *            new value
	 */
	public void setCreateDate(Date v) {

		if (!ObjectUtils.equals(this.createDate, v)) {
			this.createDate = v;

		}

	}

	/**
	 * Get the ModifyDate
	 * 
	 * @return Date
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * Set the value of ModifyDate
	 * 
	 * @param v
	 *            new value
	 */
	public void setModifyDate(Date v) {

		if (!ObjectUtils.equals(this.modifyDate, v)) {
			this.modifyDate = v;

		}

	}

	/**
	 * Get the PicturePath
	 * 
	 * @return String
	 */
	public String getPicturePath() {
		return picturePath;
	}

	/**
	 * Set the value of PicturePath
	 * 
	 * @param v
	 *            new value
	 */
	public void setPicturePath(String v) {

		if (!ObjectUtils.equals(this.picturePath, v)) {
			this.picturePath = v;

		}

	}

	/**
	 * Get the ItemId
	 * 
	 * @return int
	 */
	public int getKeywordId() {
		return keywordId;
	}

	/**
	 * Set the value of ItemId
	 * 
	 * @param v
	 *            new value
	 */
	public void setKeywordId(int v) {

		if (this.keywordId != v) {
			this.keywordId = v;

		}

	}

	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("Video:\n");
		str.append("VideoId = ").append(getVideoId()).append("\n");
		str.append("Name = ").append(getName()).append("\n");
		str.append("Url = ").append(getUrl()).append("\n");
		str.append("VideoLength = ").append(getVideoLength()).append("\n");
		str.append("Source = ").append(getSource()).append("\n");
		str.append("Category = ").append(getCategory()).append("\n");
		str.append("IndexType = ").append(getIndexType()).append("\n");
		str.append("Sort = ").append(getSort()).append("\n");
		str.append("CreateDate = ").append(getCreateDate()).append("\n");
		str.append("ModifyDate = ").append(getModifyDate()).append("\n");
		str.append("PicturePath = ").append(getPicturePath()).append("\n");
		str.append("keywordId = ").append(getKeywordId()).append("\n");
		str.append("ExpiredDate = ").append(getExpiredStrDate()).append("\n");
		return (str.toString());
	}
}

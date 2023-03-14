package com.tech.blog.entities;

import java.sql.Timestamp;

public class Post {
private int pId;
private String pTitle;
private String pContent;
private String pPic;
private String pCode;
private Timestamp pDate;
private int catId;
private int userId;
/**
 * @param pId
 * @param pTitle
 * @param pContent
 * @param pPic  
 * @param pCode
 * @param pDate
 * @param catId
 */
public Post(int pId, String pTitle, String pContent, String pPic, String pCode, Timestamp pDate, int catId,int userId) {
	super();
	this.pId = pId;
	this.pTitle = pTitle;
	this.pContent = pContent;
	this.pPic = pPic;
	this.pCode = pCode;
	this.pDate = pDate;
	this.catId = catId;
	this.userId = userId;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpTitle() {
	return pTitle;
}
public void setpTitle(String pTitle) {
	this.pTitle = pTitle;
}
public String getpContent() {
	return pContent;
}
public void setpContent(String pContent) {
	this.pContent = pContent;
}
public String getpPic() {
	return pPic;
}
public void setpPic(String pPic) {
	this.pPic = pPic;
}
public String getpCode() {
	return pCode;
}
public void setpCode(String pCode) {
	this.pCode = pCode;
}
public Timestamp getpDate() {
	return pDate;
}
public void setpDate(Timestamp pDate) {
	this.pDate = pDate;
}
public int getCatId() {
	return catId;
}
public void setCatId(int catId) {
	this.catId = catId;
}
/**
 * @param pTitle
 * @param pContent
 * @param pPic
 * @param pCode
 * @param pDate
 * @param catId
 */
public Post(String pTitle, String pContent, String pPic, String pCode, int catId,int userId) {
	super();
	this.pTitle = pTitle;
	this.pContent = pContent;
	this.pPic = pPic;
	this.pCode = pCode;
	this.catId = catId;
	this.userId = userId;
}
/**
 * 
 */
public Post() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}

 
}

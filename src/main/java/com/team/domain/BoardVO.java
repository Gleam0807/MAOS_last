package com.team.domain;

import java.sql.Date;

public class BoardVO {
	
	private int applyid;
	private String docfile;
	private String category;
	private String title;
	private String content;
	private String userid;
	private String approved;
	private String refcontent;
	private String worktype;
	private int price;
	private Date writedate;
	private Date startday;
	private Date endday;
	
	public int getApplyid() {
		return applyid;
	}
	public void setApplyid(int applyid) {
		this.applyid = applyid;
	}
	public String getDocfile() {
		return docfile;
	}
	public void setDocfile(String docfile) {
		this.docfile = docfile;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getRefcontent() {
		return refcontent;
	}
	public void setRefcontent(String refcontent) {
		this.refcontent = refcontent;
	}
	public String getWorktype() {
		return worktype;
	}
	public void setWorktype(String worktype) {
		this.worktype = worktype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	public Date getStartday() {
		return startday;
	}
	public void setStartday(Date startday) {
		this.startday = startday;
	}
	public Date getEndday() {
		return endday;
	}
	public void setEndday(Date endday) {
		this.endday = endday;
	}
	@Override
	public String toString() {
		return "BoardVO [applyid=" + applyid + ", docfile=" + docfile + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", userid=" + userid + ", approved=" + approved + ", refcontent="
				+ refcontent + ", worktype=" + worktype + ", price=" + price + ", writedate=" + writedate
				+ ", startday=" + startday + ", endday=" + endday + "]";
	}
	
	
	
	
	
}

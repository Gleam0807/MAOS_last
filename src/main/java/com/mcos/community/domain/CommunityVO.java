package com.mcos.community.domain;

import java.util.Date;

public class CommunityVO {
	
	private int comid; 		//글 번호
	private int reads;			//조회수
	private String userid;		//회원가입 한 유저 사원번호
	private String username;	//유저 이름
	private String title;		//글 제목
	private String comContent;	//글 내용
	private Date writeDate;		//작성 일
	
	public int getComid() {	
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public int getReads() {
		return reads;
	}
	public void setReads(int reads) {
		this.reads = reads;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {	
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComContent() {
		return comContent;
	}
	public void setComContent(String comContent) {
		this.comContent = comContent;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "CommunityVO [comid=" + comid + ", reads=" + reads + ", userid=" + userid + ", username=" + username
				+ ", title=" + title + ", comContent=" + comContent + ", writeDate=" + writeDate + "]";
	}
	
	

	
}

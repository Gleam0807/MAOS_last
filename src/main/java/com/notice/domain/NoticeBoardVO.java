package com.notice.domain;


import java.sql.Timestamp;

public class NoticeBoardVO {
	
	private int noticeid;
	private String name;
	private String title;
	private String content;
	private Timestamp writeDate;
	
	public int getNoticeid() {
		return noticeid;
	}
	public void setNoticeid(int noticeid) {
		this.noticeid = noticeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "NoticeBoardVO [noticeid=" + noticeid + ", name=" + name + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + "]";
	}
	
	
	
	
	
}

package com.mcos.community.domain;

import java.sql.Timestamp;

public class ReplyVO {
	
	private int comid;				//게시글 번호
	private int replyid; 			//댓글 번호
	private String username; 		//작성자
	private String userid;			//사원번호
	private String content;	 		//댓글 내용
	private Timestamp writeDate; 	//댓글 작성 날짜
	
	
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public int getReplyid() {
		return replyid;
	}
	public void setReplyid(int replyid) {
		this.replyid = replyid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
		return "ReplyVO [comid=" + comid + ", replyid=" + replyid + ", username=" + username + ", userid=" + userid
				+ ", content=" + content + ", writeDate=" + writeDate + "]";
	}
	
	
	
}

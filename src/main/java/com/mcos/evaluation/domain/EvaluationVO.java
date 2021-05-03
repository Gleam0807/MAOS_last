package com.mcos.evaluation.domain;

import java.sql.Timestamp;

public class EvaluationVO {
	
	private int evalid; 	 //글 번호
	private String attitude; //근무 태도
	private String tenacity; //인성
	private String ability;	 //능력
	private String achievements; //업적
	private String evaluationEtc; //기타사항
	private String userid; //userid
	private String target; // 평가 받는 대상자
	private Timestamp evaluationDate; // 평가한 날
	
	public int getevalid() {
		return evalid;
	}
	public void setevalid(int evalid) {
		this.evalid = evalid;
	}
	public String getAttitude() {
		return attitude;
	}
	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}
	public String getTenacity() {
		return tenacity;
	}
	public void setTenacity(String tenacity) {
		this.tenacity = tenacity;
	}
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public String getEvaluationEtc() {
		return evaluationEtc;
	}
	public void setEvaluationEtc(String evaluationEtc) {
		this.evaluationEtc = evaluationEtc;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String gettarget() {
		return target;
	}
	public void settarget(String target) {
		this.target = target;
	}
	public Timestamp getEvaluationDate() {
		return evaluationDate;
	}
	public void setEvaluationDate(Timestamp evaluationDate) {
		this.evaluationDate = evaluationDate;
	}
	@Override
	public String toString() {
		return "EvaluationVO [evalid=" + evalid + ", attitude=" + attitude + ", tenacity=" + tenacity + ", ability="
				+ ability + ", achievements=" + achievements + ", evaluationEtc=" + evaluationEtc + ", userid=" + userid
				+ ", target=" + target + ", evaluationDate=" + evaluationDate + "]";
	}
	
	
	
	
}

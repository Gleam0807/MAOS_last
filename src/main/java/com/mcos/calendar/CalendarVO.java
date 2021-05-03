package com.mcos.calendar;





import org.springframework.stereotype.Component;

@Component
public class CalendarVO {
	
	private String year;
	private String month;
	private String day;
	private String title;
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "CalendarVO [year=" + year + ", month=" + month + ", day=" + day + ", title=" + title + "]";
	}
	
	
}
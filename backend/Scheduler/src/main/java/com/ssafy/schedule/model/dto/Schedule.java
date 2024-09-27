package com.ssafy.schedule.model.dto;
public class Schedule {
	private static int no = 1;
	private int id;
	private int date;
	private String content;
	private String semicontent;
	
	public Schedule() {
	}

	public Schedule(int id, int date, String content, String semicontent) {
		this.id = id;
		this.date = date;
		this.content = content;
		this.semicontent = semicontent;
	}

	public static int getNo() {
		return no;
	}

	public static void setNo(int no) {
		Schedule.no = no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSemicontent() {
		return semicontent;
	}

	public void setSemicontent(String semicontent) {
		this.semicontent = semicontent;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", date=" + date + ", content=" + content + ", semicontent=" + semicontent + "]";
	}
	
	
	
}

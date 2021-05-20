package com.mycos.web.entity;

public class CourseItem {
//'COURSE_ID','ITEM_ID'
	
	private int course_id;
	private int item_id;
	
	public CourseItem() {
		// TODO Auto-generated constructor stub
	}

	public CourseItem(int course_id, int item_id) {
		this.course_id = course_id;
		this.item_id = item_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	@Override
	public String toString() {
		return "CourseItem [course_id=" + course_id + ", item_id=" + item_id + "]";
	}
	
	
}

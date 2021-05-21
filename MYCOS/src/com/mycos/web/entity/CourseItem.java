package com.mycos.web.entity;

public class CourseItem {
//'COURSE_ID','ITEM_ID'
	
	private int courseId;
	private int itemId;
	
	public CourseItem() {
		// TODO Auto-generated constructor stub
	}

	public CourseItem(int courseId, int itemId) {
		this.courseId = courseId;
		this.itemId = itemId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "CourseItem [courseId=" + courseId + ", itemId=" + itemId + "]";
	}
	
	
}

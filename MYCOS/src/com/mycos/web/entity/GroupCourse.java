package com.mycos.web.entity;

public class GroupCourse {
	
	//'GROUP_ID','COURSE_ID'
	
	private int group_id;
	private int course_id;
	
	public GroupCourse() {
		// TODO Auto-generated constructor stub
	}

	public GroupCourse(int group_id, int course_id) {
		this.group_id = group_id;
		this.course_id = course_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}



	@Override
	public String toString() {
		return "GroupCourse [group_id=" + group_id + ", course_id=" + course_id + "]";
	}
	
	

}

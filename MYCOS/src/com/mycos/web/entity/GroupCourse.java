package com.mycos.web.entity;

public class GroupCourse {
	
	//'GROUP_ID','COURSE_ID'
	
	private int groupId;
	private int courseId;
	
	public GroupCourse() {
		// TODO Auto-generated constructor stub
	}

	public GroupCourse(int groupId, int courseId) {
		this.groupId = groupId;
		this.courseId = courseId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	@Override
	public String toString() {
		return "GroupCourse [groupId=" + groupId + ", courseId=" + courseId + "]";
	}
	
	

}


package com.virtusa.cmadv.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="courses_cma")
public class Courses {
	@Id
	@Column
	private String courseId;
	@Column
	private String courseName;
	@Column
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column
	@Temporal(TemporalType.DATE)
	private Date endDate;
//	public List<Faculty> getFaculty() {
//		return faculty;
//	}
//	public void setFaculty(List<Faculty> faculty) {
//		this.faculty = faculty;
//	}
//	@ManyToMany
//	private List<Faculty> faculty;
	
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
	
	
}
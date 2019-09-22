package com.virtusa.cma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	@Id
	@Column(name="username")
	private String userName;
	@Column(name="usertype")
	private String userType;
	@Column(name="rating")
	private String rating;
	@Column(name="comments")
	private String comments;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Feedback [userName=" + userName + ", userType=" + userType + ", rating=" + rating + ", comments="
				+ comments + "]";
	}
	
	

}

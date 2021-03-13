package com.ga.bookclub.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 50)
	private String name; 
	
	@Column(length = 50)
	private String emailAddress; 
	@Column(length = 255)
	private String password;
	
	private String updatedPassword;
	@Column(length = 1000)
	private String image;
	
	private String userRole;
	@JsonBackReference
	 @OneToMany(mappedBy="user")
	  private Set<Review> review_user;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Set<Review> getReview_user() {
		return review_user;
	}
	public void setReview_user(Set<Review> review_user) {
		this.review_user = review_user;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUpdatedPassword() {
		return updatedPassword;
	}
	public void setUpdatedPassword(String updatedPassword) {
		this.updatedPassword = updatedPassword;
	}
	
}

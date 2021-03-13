package com.ga.bookclub.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 1000)
	private String reviewContent;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "Fk_review_book")
	private Book book;
	
	@ManyToOne
	@JoinColumn(name = "Fk_review_user")
	private User user;
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}

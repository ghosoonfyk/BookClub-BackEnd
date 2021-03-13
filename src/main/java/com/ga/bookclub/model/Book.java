package com.ga.bookclub.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Book")

public class Book {

	@Id
	@GeneratedValue
	private int id;

	private String bookName;
	@Column(length = 6)
	private int numberOfpages;

	private String authorName;

	private String category;

	@Column(length = 2000)
	private String description;

	@Column(length = 1000)
	private String image;
	private Date publish;

//		  @JsonBackReference
	@OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
	private Set<Review> review_book;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfpages() {
		return numberOfpages;
	}

	public void setNumberOfpages(int numberOfpages) {
		this.numberOfpages = numberOfpages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getPublish() {
		return publish;
	}

	public void setPublish(Date publish) {
		this.publish = publish;
	}

	public Set<Review> getReview_book() {
		return review_book;
	}

	public void setReview_book(Set<Review> review_book) {
		this.review_book = review_book;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}

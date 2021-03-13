package com.ga.bookclub.dao;

import org.springframework.data.repository.CrudRepository;

import com.ga.bookclub.model.Review;


public interface ReviewDao extends CrudRepository<Review, Integer> {
	
	public Review findById(int id);

}

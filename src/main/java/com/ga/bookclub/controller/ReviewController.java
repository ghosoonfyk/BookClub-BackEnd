package com.ga.bookclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ga.bookclub.dao.ReviewDao;
import com.ga.bookclub.model.Review;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewDao reviewDao;
	
	@PostMapping("review/add")
	public boolean addReview(@RequestBody Review review) {
		reviewDao.save(review); 
		System.out.println(review.getReviewContent());
		return true;
	}
	
	@GetMapping("/review/index")
	public Iterable<Review> getReviews() {
		var reviews = reviewDao.findAll();
		return reviews;
	}
	
	@PutMapping("/review/edit")
	public Review editReview(@RequestBody Review review) {
		reviewDao.save(review);
		return review;
	}


	@DeleteMapping("/review/delete")
	public boolean deleteReview(@RequestParam int id) {
		boolean flag = false;
		Review review = reviewDao.findById(id);
		
		if(review != null) {
			flag = true;
			reviewDao.deleteById(id);
		}
		
		return flag;
	}
}

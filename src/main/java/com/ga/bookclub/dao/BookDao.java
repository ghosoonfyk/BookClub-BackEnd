package com.ga.bookclub.dao;

import org.springframework.data.repository.CrudRepository;

import com.ga.bookclub.model.Book;

public interface BookDao  extends CrudRepository<Book, Integer> {
	public Book findById(int id);
}

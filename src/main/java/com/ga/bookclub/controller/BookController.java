package com.ga.bookclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


import com.ga.bookclub.dao.BookDao;
import com.ga.bookclub.model.Book;

@RestController
public class BookController {

	
	@Autowired
	private BookDao bookDao;
	
	@PostMapping("/book/add")
	public Book addBook(@RequestBody Book book) {
		bookDao.save(book);
		return book;
	}
	
	@GetMapping("/book/index")
	public Iterable<Book> getBook() {
		var books = bookDao.findAll();
		return books;
	}
	
	@GetMapping("/book/detail")
	public Book bookDetails(@RequestParam int id) {
		System.out.println(id);
		Book book = bookDao.findById(id);
		return book;
	}
	@PutMapping("/book/edit")
	public Book editbook(@RequestBody Book book) {
		var newBook=bookDao.save(book);
		return newBook;
	}
	@DeleteMapping("/book/delete")
	public boolean deleteAuthor(@RequestParam int id) {
		Book book = bookDao.findById(id);
		bookDao.deleteById(id);
		return true;
	}
	
	
	
	
	
}

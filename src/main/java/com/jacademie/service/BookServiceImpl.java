package com.jacademie.service;

import org.springframework.stereotype.Service;

import com.jacademie.domain.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	public Book findBook() {
		
		Book book = new Book("Corneille", "Le Cid");
		
		return book;
	}
}

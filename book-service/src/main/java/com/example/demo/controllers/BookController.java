package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.services.BookService;

@RestController
@RequestMapping(path="/api/v1")
public class BookController {

	@Autowired
	public BookService service;
	
	@GetMapping(path="/book{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return this.service.getBookById(id);
	}
	
	
}

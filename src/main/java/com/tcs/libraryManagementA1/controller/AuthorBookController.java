package com.tcs.libraryManagementA1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.libraryManagementA1.model.Author;
import com.tcs.libraryManagementA1.service.AuthorBookService;

@RestController
@RequestMapping("/api/authorBook")
public class AuthorBookController {
	private AuthorBookService authorBookService;

	@Autowired
	public AuthorBookController(AuthorBookService authorBookService) {
		super();
		this.authorBookService = authorBookService;
	}

	@PostMapping
	public Author saveAuthorWithBook(@RequestBody Author author) {
		return authorBookService.saveAuthorWithBook(author);
	}

}

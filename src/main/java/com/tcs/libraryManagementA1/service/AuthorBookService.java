package com.tcs.libraryManagementA1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.libraryManagementA1.model.Author;
import com.tcs.libraryManagementA1.repository.AuthorRepository;
import com.tcs.libraryManagementA1.repository.BookRepository;

@Service
public class AuthorBookService {
	private BookRepository bookRepository;
	private AuthorRepository authorRepository;

	@Autowired
	public AuthorBookService(BookRepository bookRepository, AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	public Author saveAuthorWithBook(Author author) {
		return authorRepository.save(author);
//		for (Book book : author["books"]) {
//			book.getAuthors().add(author);
//		}
	}
}

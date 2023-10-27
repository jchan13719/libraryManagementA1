package com.tcs.libraryManagementA1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.libraryManagementA1.model.Book;
import com.tcs.libraryManagementA1.repository.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	public Book getBook(int Id) {
		return bookRepository.getReferenceById(Id);
	}

	public Book addBook(Book newBook) {
		return bookRepository.saveAndFlush(newBook);
	}

	public Book updateBook(Integer Id, Book newBook) {
		Book foundBook = getBook(Id);
		// Set based on the newBook's values
		foundBook.setAuthor(newBook.getAuthor());
		foundBook.setGenre(newBook.getGenre());
		foundBook.setName(newBook.getName());
		foundBook.setPages(newBook.getPages());

		return bookRepository.saveAndFlush(foundBook);
	}

	public void deleteBook(int Id) {
		bookRepository.deleteById(Id);
	}
}

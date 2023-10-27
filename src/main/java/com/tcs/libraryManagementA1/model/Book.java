package com.tcs.libraryManagementA1.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	private Integer ISBN;
	@Column(name = "name")
	private String name;
	@Column(name = "author")
	private String author;
	@Column(name = "pages")
	private int pages;
	@Column(name = "genre")
	private int genre;

	@ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
	Set<Author> authors;

	public Book() {
		super();
	}

	public Book(Integer ISBN, String name, String author, int pages) {
		super();
		this.ISBN = ISBN;
		this.name = name;
		this.author = author;
		this.pages = pages;
	}

	public Integer getISBN() {
		return ISBN;
	}

	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

}

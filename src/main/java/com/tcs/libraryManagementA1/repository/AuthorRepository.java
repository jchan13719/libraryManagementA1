package com.tcs.libraryManagementA1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.libraryManagementA1.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}

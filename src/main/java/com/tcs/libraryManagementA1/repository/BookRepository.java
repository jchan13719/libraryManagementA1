package com.tcs.libraryManagementA1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.libraryManagementA1.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

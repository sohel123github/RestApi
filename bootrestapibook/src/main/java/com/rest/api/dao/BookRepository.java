package com.rest.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.api.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	public Book findById(int id);

}

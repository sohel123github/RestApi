package com.rest.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.dao.BookRepository;
import com.rest.api.entity.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	//Get,put,post,delete mapping--------->
	/*private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(1,"Java","Xyz"));
		list.add(new Book(2,"Python","Abc"));
		list.add(new Book(3,"Kotlin","Pqr"));
	}*/
	
	//Get all books-
	public List<Book> getAllBooks(){
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}
	
	//Get single book by Id-
	public Book getBookById(int id){
		Book book=null;
		try {
			book = this.bookRepository.findById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//add book-service
	public Book addBook(Book b) {
		Book result = this.bookRepository.save(b);
		return result;
	}
	
	//delete book-service
	public void deleteBook(int bid) {
		this.bookRepository.deleteById(bid);
	}
	
	//update book-service
	public void updateBook(Book book,int bookId) {
		book.setId(bookId);
		this.bookRepository.save(book);
	}
	
}


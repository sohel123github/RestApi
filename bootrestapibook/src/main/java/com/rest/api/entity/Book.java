package com.rest.api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//Get,put,post,delete mapping class------>
/*@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	
	private String author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}*/


@Entity
@Table(name="books")
public class Book {
		
		@Id
		@Column(name="book_id")
		private int id;
		
		private String title;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JsonManagedReference
		private Author author;

		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Book(int id, String title, Author author) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
		}
	}

	
	


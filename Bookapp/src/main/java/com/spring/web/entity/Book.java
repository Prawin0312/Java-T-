package com.spring.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book 
{ 
	@Id
   int bookid;
   String booktitle;
   int price;
   String author;
   public Book() {}
    public Book(int bookid, String booktitle, int price, String author) 
    {

	this.bookid = bookid;
	this.booktitle = booktitle;
	this.price = price;
	this.author = author;
    }
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}     
}

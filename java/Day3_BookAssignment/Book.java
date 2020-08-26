package com.pojo;

public class Book {

	private long ISBN;
	private String name;
	private double price;
	private String publication;
	private String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long iSBN, String name, double price) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.price = price;
	}
	
	public Book(long iSBN, String name, String publication, String author) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.publication = publication;
		this.author = author;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", name=" + name + ", price=" + price + ", publication=" + publication
				+ ", author=" + author + "]";
	}
	
}

package com.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.contract.BookStore;
import com.io.BookNotFoundException;
import com.pojo.Book;

public class BookStoreImpl implements BookStore {

	@Override
	public Book[] getbooks() {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Book[] books=new Book[5];
		long isbn;
		String name,pub,author;
		double price;
		for(int i=0;i<5;i++){
			System.out.println("Enter book info : ");
			
			
			try {
				System.out.println("Enter ISBN number: ");
				isbn=Long.parseLong(reader.readLine());
				
				System.out.println("Enter Name : ");
				 name=reader.readLine();
				
				System.out.println("Enter price : ");
				price = Double.parseDouble(reader.readLine());
				
				System.out.println("Enter Publication : ");
				pub=reader.readLine();
				
				System.out.println("Enter Author : ");
				author = reader.readLine();
				
				books[i]=new Book(isbn,name,pub,author);
				books[i].setPrice(price);
						
				
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return books;
	}

	@Override
	public Book findBookById(Book[] books, long Id) {
		// TODO Auto-generated method stub
		for(Book b : books)
		{
			if(b.getISBN()==Id)
			{
				return b;
			}
		}
			try{
				throw new BookNotFoundException("Book not Found....");
			}
			catch (BookNotFoundException e) {
				e.printStackTrace();
			}
		
		return null;
	}

	@Override
	public Book findBookByName(Book[] books, String name) {
		// TODO Auto-generated method stub

		for(Book b : books)
		{
			if(b.getName().equals(name))
			{
				return b;
			}
		}
			try{
				throw new BookNotFoundException("Book not Found....");
			}
			catch (BookNotFoundException e) {
				e.printStackTrace();
			}
		
		return null;
	}

	@Override
	public Book updateBook(Book[] books, long Id, double price) {
		// TODO Auto-generated method stub

		for(Book b : books)
		{
			if(b.getISBN()==Id)
			{
				b.setPrice(price);
				return b;
			}
		}
		try{
				throw new BookNotFoundException("Book not Found....");
		}
		catch (BookNotFoundException e) {
				e.printStackTrace();
		}
		return null;
	}

	@Override
	public void display(Book[] books) {
		// TODO Auto-generated method stub
		
		for(Book b : books)
		{
			System.out.println(b);
		}
		
	}	

}

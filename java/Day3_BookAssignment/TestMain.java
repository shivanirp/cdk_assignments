package com.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.pojo.Book;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookStoreImpl bs = new BookStoreImpl();
		Book[] books=bs.getbooks();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Book b;
		long isbn;
		String name;
		double price;
		int choice;
		String con;
		try {
			do{
				System.out.println("\n1. find by id\n2. findByName\n3. update price\n4. display all\nEnter Your Choice:");
				choice=Integer.parseInt(reader.readLine());
				
				switch(choice)
				{
				case 1: System.out.println("Enter ISBN number to find the book : ");
						isbn = Integer.parseInt(reader.readLine());
						b = bs.findBookById(books, isbn);
						if(b!=null)
							System.out.println(b);
						break;
				case 2:	System.out.println("Enter Name to find the book : ");
						name=reader.readLine();
						b=bs.findBookByName(books, name);
						if(b!=null)
							System.out.println(b);
						break;
				case 3: System.out.println("Enter ISBN to update book name : ");
						isbn = Integer.parseInt(reader.readLine());
						System.out.println("Enter new price : ");
						price=Double.parseDouble(reader.readLine());
						b=bs.updateBook(books, isbn, price);
						if(b!=null)
							System.out.println(b);
						break;
				case 4: System.out.println("\n All Books\n");
						bs.display(books);
						break;
				default:break;
				}
				System.out.println("\nDo you want to continue?(y/n)");
				con=reader.readLine();
			
			}while(con!="n" || con!="N");
			
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}

//Interface

package com.contract;

import com.pojo.Book;

public interface BookStore {
	
	Book[] getbooks();
	
	Book findBookById(Book[] books, long Id);
	
	Book findBookByName(Book[]books, String name);
	
	Book updateBook(Book[] books, long Id, double price);
	
	void display(Book[] books);

}

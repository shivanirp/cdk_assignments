
public class testStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookStore bksr=new BookStore();
		book[] bk=bksr.createStore();
		for(book b : bk)
		{
			b.display();
		}
		
		int isbn = 44444;
		System.out.println("\nFind book of ISBN number "+ isbn);
		book b = bksr.findBk(isbn);
		if(b==null)
			System.out.println("Book not found");
		else
			b.display();
		
		double newPrice = 999.9; 
		System.out.println("\nUpdate book price of ISBN number "+ isbn);
		book bb = bksr.updatePrice(isbn, newPrice);
		if(b==null)
			System.out.println("Book not found");
		else
			b.display();
	}

}


public class BookStore {

	book[] bk=new book[5];
	
	public book[] createStore()
	{
		bk[0]=new book(11111,"SPJ","Disha","RKS");
		bk[0].setPrice(333.33);
		bk[1]=new book(22222,"RPL","SRK","Tom");
		bk[1].setPrice(444.44);
		bk[2]=new book(33333,"PLC","Vidya","Joey");
		bk[2].setPrice(665.43);
		bk[3]=new book(44444,"SQL","Disha","Hanna");
		bk[3].setPrice(543.8);
		bk[4]=new book(55555,"Java","Bob","Jia");
		bk[4].setPrice(657.7);
		return bk;
	}
	
	public book findBk(int isbn)
	{
		for(book b : bk)
		{
			if(isbn==b.getISBN())
			{
				return b;
			}
		}
		return null;
	}
	
	public book updatePrice(int isbn, double newPrice)
	{
		for(book b : bk)
		{
			if(isbn==b.getISBN())
			{
				b.setPrice(newPrice);
				return b;
			}
		}
		return null;
	}

}

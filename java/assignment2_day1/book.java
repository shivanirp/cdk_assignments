
public class book {

	private long ISBN;
	private String name;
	private double price;
	private String publication;
	private String author;
	
	public book()
	{
		ISBN=0;
		name=null;
		price=0.0;
		publication=null;
		author=null;
	}
	
	public book(long ISBN,String name, double price)
	{
		this.ISBN=ISBN;
		this.name=name;
		this.price=price;
	}
	
	public book(long ISBN,String name, String publication, String author)
	{
		this.ISBN=ISBN;
		this.name=name;
		this.publication=publication;
		this.author=author;
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
	
	public void display()
	{
		System.out.println("ISBN : "+this.ISBN+"\t Name : "+this.name+"\t Publication : "+this.publication+
				"\t Author : "+this.author+"\t Price : "+this.price);
	}

}

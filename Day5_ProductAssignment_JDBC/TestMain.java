import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.dao.ProductDAOImpl;
import com.io.ProductIoImpl;
import com.pojo.Product;

public class TestMain {

	public static void main(String[] args) throws NoSuchElementException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ProductDAOImpl daoImpl = new ProductDAOImpl();
		ProductIoImpl impl = new ProductIoImpl();
		Product product = new Product();
		List<Product> products = new ArrayList<>();
		int choice = 0;
		int pId;
		
			do
			{
				try{
				System.out.println("\nMenu\n1. Add Product\n2. Update Price\n3. Update Quantity\n4. Find by Id\n5. Find by Category"
						+ "\n6. Display All Products\n0. Exit\nEnter your choice : ");
				
					choice = s.nextInt();
				
					switch(choice)
					{
					case 0: System.out.println("Exit");
							break;
							
					case 1: product=impl.getProduct();
							int inserted = daoImpl.addProduct(product);
							if(inserted>0)
								System.out.println("inserted value");
							else
								System.out.println("Sorry");
							break;
							
					case 2: System.out.println("Enter product id to update price : ");
							pId= s.nextInt();
							System.out.println("Enter new price : ");
							double price=s.nextDouble();
							boolean b=daoImpl.updateProduct(pId, price);
							if(b)
								System.out.println("Updated successfully");
							break;
					case 3: System.out.println("Enter product id to update quantity : ");
							pId= s.nextInt();
							System.out.println("Enter new quantity : ");
							int quantity=s.nextInt();
							boolean b1=daoImpl.updateProduct(pId, quantity);
							if(b1)
								System.out.println("Updated successfully");
							break;
					case 4: System.out.println("Enter product id to find : ");
							pId= s.nextInt();
							product=daoImpl.findById(pId);
							if(product!=null)
								impl.displayProduct(product);
							else
								System.out.println("Record not found..");
							break;
					case 5: System.out.println("Enter product category to find : ");
							String category=s.next();
							products=daoImpl.findAllByCategory(category);
							if(products!=null){
								for(Product p : products)
									impl.displayProduct(p);
							}
							else
								System.out.println("No records found..");
							break;
					case 6: products=daoImpl.findAll();
							if(products!=null){
								for(Product p : products)
									impl.displayProduct(p);
							}
							else
								System.out.println("No records found..");
							break;
					}
				
					} catch(Exception e)
					{
						e.printStackTrace();
					}
					

			} while (choice != 0);
		
		
	}

}

package com.io;

import java.util.Scanner;

import com.pojo.Product;

public class ProductIoImpl implements ProductIo {

	Scanner sc = new Scanner(System.in);
	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter product id : ");
		int pId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product name : ");
		String pName=sc.nextLine();
		System.out.println("Enter price : ");;
		double price=sc.nextDouble();
		System.out.println("Enter quantity : ");
		int quantity = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter category : ");
		String category = sc.nextLine();
		Product product=new Product(pId,pName,price,quantity,category);
	
		return product;
		
	}

	@Override
	public void displayProduct(Product product) {
		// TODO Auto-generated method stub
		
		System.out.println(product.getpId()+"\t"+product.getpName()+"\t"+product.getPrice()+"\t"+product.getQuantity()
				+"\t"+product.getCategory());
		
	}

}

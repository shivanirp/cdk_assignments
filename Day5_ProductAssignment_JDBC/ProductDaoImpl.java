package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.exception.ProductNotFoundException;
import com.pojo.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		Connection con=connectToDatabase();

		try {
			String insertData = "insert into Product values(?,?,?,?,?)";		
			PreparedStatement ps = con.prepareStatement(insertData);
		
			ps.setInt(1, product.getpId());
			ps.setString(2, product.getpName());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			ps.setString(5, product.getCategory());
			
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean updateProduct(int productId, double price) {
		// TODO Auto-generated method stub
		Connection con=connectToDatabase();

		try {
			String insertData = "update Product set price=? where pId=?";		
			PreparedStatement ps = con.prepareStatement(insertData);
		
			ps.setDouble(1, price);
			ps.setInt(2, productId);
			int update=ps.executeUpdate();
			if(update>0)
				return true;
			else
				notFound();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateProduct(int productId, int quantity) {
		// TODO Auto-generated method stub
		Connection con=connectToDatabase();

		try {
			String insertData = "update Product set quantity=? where pId=?";		
			PreparedStatement ps = con.prepareStatement(insertData);
		
			ps.setInt(1, quantity);
			ps.setInt(2, productId);
			int update=ps.executeUpdate();
			if(update>0)
				return true;
			else
				notFound();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Product findById(int productId) {
		// TODO Auto-generated method stub
		Connection con=connectToDatabase();
		Product product=null;
		try {
			String findData = "select * from Product where pId=?";
			PreparedStatement ps = con.prepareStatement(findData);
		
			ps.setInt(1, productId);
			
			ResultSet resultSet=ps.executeQuery();
			
			while(resultSet.next())
			{
				product=new Product();
				product.setpId(resultSet.getInt("pId"));
				product.setpName(resultSet.getString("pName"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCategory(resultSet.getString("category"));
			}
			if(product!=null)
				return product;
			else
				notFound();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		Connection con=connectToDatabase();
		Product product;
		try {
			String findData = "select * from Product";
			
			Statement st=con.createStatement();
			
			ResultSet resultSet=st.executeQuery(findData);
			
			while(resultSet.next())
			{
				product=new Product();
				product.setpId(resultSet.getInt("pId"));
				product.setpName(resultSet.getString("pName"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCategory(resultSet.getString("category"));
				products.add(product);
			}
			return products;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findAllByCategory(String category) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		Connection con=connectToDatabase();
		Product product;
		try {
			String findData = "select * from Product where category=?";
			PreparedStatement ps = con.prepareStatement(findData);
		
			ps.setString(1, category);
			
			ResultSet resultSet=ps.executeQuery();
			
			while(resultSet.next())
			{
				product=new Product();
				product.setpId(resultSet.getInt("pId"));
				product.setpName(resultSet.getString("pName"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCategory(resultSet.getString("category"));
				products.add(product);
			}
			if(products!=null)
				return products;
			else
				notFound();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Connection connectToDatabase()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/mysql","root","root123");  
		
			return con;
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	public void notFound()
	{
		try{
			throw new ProductNotFoundException("Product not found..");
		}catch (ProductNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

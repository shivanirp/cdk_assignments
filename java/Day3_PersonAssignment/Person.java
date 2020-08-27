package com.pojo;

public class Person {

	private int pId;
	private String pName;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		pId=0;
		pName=null;
	}

	public Person(int pId) {
		super();
		this.pId = pId;
	}
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p=(Person) obj;
		
		return (this.getpId()==p.getpId() &&
				this.getpName().equals(p.getpName()));
	}
}

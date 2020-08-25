package studentAssignment;

public class Student {

	private int rollNo;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		rollNo=0;
		name=null;
	}
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RollNo=" + rollNo + "\tName=" + name ;
	}

	public boolean equals(Student x) {
		// TODO Auto-generated method stub
		
		return (this.getRollNo()==x.getRollNo() &&
				(this.getName().equals(x.getName())));
	}

	
}


public class Employee {
	
	private int empId;
	private String empName;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Emp");
		empId=1;
		empName="Mike";

	}


	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void display()
	{
		System.out.println("Id : "+this.empId+"\t Name : "+this.empName);
	}

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}

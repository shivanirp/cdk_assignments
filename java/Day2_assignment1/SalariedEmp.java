
public class SalariedEmp extends Employee {
	
	private long salary;
	private double incentives;
	private double ta;
	
	public SalariedEmp() {
		super();
		// TODO Auto-generated constructor stub
		salary=50000;
		incentives=1000.9;
		ta=2000.0;
	}

	public SalariedEmp(int empId, String empName, long salary, double incentives, double ta) {
		super(empId, empName);
		this.salary = salary;
		this.incentives = incentives;
		this.ta = ta;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Salary : "+this.salary+"\t Incentives : "+this.incentives+"\t TA : "+this.ta);
	}
	
	public long totalSalary()
	{
		return (long) (this.salary+this.incentives+this.ta);
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public double getIncentives() {
		return incentives;
	}
	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	
}

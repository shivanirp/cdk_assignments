import java.util.*;
class Emp
{
	private int empno;
	private String name;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class EmpManager
{
	int count = 2;
	private Emp[] arr=new Emp[count];
	Scanner s=new Scanner(System.in);
	public void create(Emp e)
	{
		for(int i=0;i<count;i++)
		{
			arr[i]=new Emp();
			System.out.print("Enter id:");
			arr[i].setEmpno(s.nextInt());
			System.out.print("Enter name:");
			arr[i].setName(s.next());
			System.out.print("Enter salary:");
			arr[i].setSalary(s.nextDouble());
		}
	}
	public void print()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("ID : "+arr[i].getEmpno()+", Name : "+arr[i].getName()+", Salary : "+arr[i].getSalary());
		}
	}
	public void update(int item, Emp e)
	{
		
	}
	
}
public class Demo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		EmpManager em=new EmpManager();
		Emp e=new Emp();
		em.create(e);
		em.print();
	}
	
}

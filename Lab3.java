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
	int count = 5;
	private Emp[] arr=new Emp[count];
	Scanner s=new Scanner(System.in);
	public void create()
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
		System.out.println("\n********************************************\n");

	}
	public void update(int item)
	{
		int flag=0;
		for(int i=0;i<count;i++)
		{
			if(arr[i].getEmpno()==item)
			{
				System.out.println("Enter updated salary: ");
				arr[i].setSalary(s.nextDouble());
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Item not found");
		}
	}
	public void delete(int item)
	{
		ArrayList<Emp> list=new ArrayList<Emp>(Arrays.asList(arr));
		
		int flag=0;
		for(int i=0;i<count;i++)
		{
			if(list.get(i).getEmpno()==item)
			{
				list.remove(i);
				flag=1;
				count--;
				list.toArray(arr);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Item not found");
		}
	}
	
}
public class Demo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		EmpManager em=new EmpManager();
		Emp e=new Emp();
		em.create();
		em.print();
		System.out.println("Enter empno to be updated:");
		int n=s.nextInt();
		em.update(n);
		em.print();
		System.out.println("Enter empno to be deleted:");
		int d=s.nextInt();
		System.out.println("After deleting empno :"+d);
		em.delete(d);
		em.print();
	}
	
}


/*
 * 
 * OUTPUT
 * Enter id:1
Enter name:aa
Enter salary:111
Enter id:2
sEnter name:s
Enter salary:222
Enter id:3
Enter name:dd
Enter salary:333
Enter id:4
Enter name:ff
Enter salary:444
Enter id:5
Enter name:gg
Enter salary:555
ID : 1, Name : aa, Salary : 111.0
ID : 2, Name : ss, Salary : 222.0
ID : 3, Name : dd, Salary : 333.0
ID : 4, Name : ff, Salary : 444.0
ID : 5, Name : gg, Salary : 555.0

********************************************

Enter empno to be updated:
2
Enter updated salary: 
888
ID : 1, Name : aa, Salary : 111.0
ID : 2, Name : ss, Salary : 888.0
ID : 3, Name : dd, Salary : 333.0
ID : 4, Name : ff, Salary : 444.0
ID : 5, Name : gg, Salary : 555.0

********************************************

Enter empno to be deleted:
4
After deleting empno :4
ID : 1, Name : aa, Salary : 111.0
ID : 2, Name : ss, Salary : 888.0
ID : 3, Name : dd, Salary : 333.0
ID : 5, Name : gg, Salary : 555.0

********************************************
 * */



public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WageEmployee w=new WageEmployee();
//		w.display();
//		
//		WageEmployee w1=new WageEmployee(2,"Donna",201,8);
//		w1.display();
		
		SalariedEmp se=new SalariedEmp(101,"Tom",50000,1500.90,468.9);
		se.display();
		System.out.println("Total Salary : "+se.totalSalary());
	}

}

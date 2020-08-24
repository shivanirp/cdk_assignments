
public class testManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentManipulation stmn=new studentManipulation();
		student[] stud=stmn.createStudent();
		for(student s : stud)
		{
			s.display();
			System.out.println("Total marks : "+s.getTotal()+"\n");
		}
		student x=stmn.findTop(stud);
		System.out.println("\nTopper:");
		x.display();
		System.out.println("Total marks : "+x.getTotal()+"\n");
	
	}

}

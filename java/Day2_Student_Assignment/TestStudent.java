package studentAssignment;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] students = new Student[7];
		
		students[0] = new EnggStudent(101, "Jeromy", "Computer Engg", "Yale");
		students[1] = new EnggStudent(102, "Dina", "Entc Engg", "Stanford");
		students[2] = new EnggStudent(103, "Jia", "Mechanical", "IIT");
		students[3] = new BscStudent(201, "Monica", "Science", "IIT");
		students[4] = new BscStudent(202, "Ross", "Maths", "NYC");
		students[5] = new CommerceStudent(301, "Bob", "Economics", "BITS");
		students[6] = new CommerceStudent(302, "Rachel", "CA", "NIT");
		
		for(Student s:students)
		{
			System.out.println(s);
		}
		
		Student x = new CommerceStudent(301, "Bob", "Economics", "BITS");
		
		System.out.println("\nSearch Commerce Student");
		boolean b=search(students,x); 
		
		if(b)
		{
			System.out.println("Student Found...");
			System.out.println(x.toString());
		}
		else
			System.out.println("Student not found...");
		
		x = new EnggStudent(104,"Joey","IT","COEP");
		
		System.out.println("\nSearch Engg Student");
		b=search(students,x); 

		if(b)
		{
			System.out.println("Student Found...");
			System.out.println(x.toString());
		}
		else
			System.out.println("Student not found...");
	}
	
	public static boolean search(Student[] students, Student s)
	{
		for(Student x:students)
		{
			if(s.getClass().equals(x.getClass()))
			{
				if(s.equals(x))
				{
					return true;
				}
			}
		}
		return false;
	}

}

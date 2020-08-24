
public class studentManipulation {
	
	static student[] objects=new student[5]; 


	public static student[] createStudent()
	{
		objects[0] = new student(1,"Joy",14,"10th",78,87,90);
		objects[1] = new student(2,"Robert",15,"10th",88,67,54);
		objects[2] = new student(3,"Vince",14,"10th",87,98,99);
		objects[3] = new student(4,"Tom",15,"10th",67,67,90);
		objects[4] = new student(5,"Bob",14,"10th",90,96,88);
		
		return objects;
	}
	
	public static int total(student student)
	{
		return (student.getPhyMarks() + student.getCheMarks() + student.getMathMarks());
	}
	
	public student findTop(student[] student){
		
		int max = 0;
		student stu=null;
		for(student s : objects){
			
			if(total(s)> max){
				max = total(s);
				s.setTotal(max);
				stu=s;
			}
			
		}

		return stu;
		
	}
}

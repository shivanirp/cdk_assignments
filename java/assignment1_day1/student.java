
public class student {
	private String name;
	private int id;
	private int age;
	private String std;
	private int phyMarks;
	private int cheMarks;
	private int mathMarks;
	private int total;
	
	public student()
	{
		id=0;
		name=null;
		age=0;
		std=null;
		phyMarks=0;
		cheMarks=0;
		mathMarks=0;
	}
	
	public student(int id, String name, int age, String std, int phyMarks, int cheMarks,int mathMarks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.std=std;
		this.phyMarks=phyMarks;
		this.cheMarks=cheMarks;
		this.mathMarks=mathMarks;
		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	
	public int getPhyMarks() {
		return phyMarks;
	}

	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}

	public int getCheMarks() {
		return cheMarks;
	}

	public void setCheMarks(int cheMarks) {
		this.cheMarks = cheMarks;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public void display()
	{
		System.out.println("ID : "+this.id+"\tName : "+this.name+"\tAge : "+this.age+
				"\tStandard : "+this.std+"\t\tPhysics Marks : "+this.phyMarks+"\tChemistry Marks : "+this.cheMarks
				+"\tMaths Marks : "+this.mathMarks );
	}
}

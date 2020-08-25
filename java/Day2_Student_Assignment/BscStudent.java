package studentAssignment;

public class CommerceStudent extends Student {

	private String majorSubject;
	private String collegeName;
	
	public CommerceStudent(int rollNo, String name) {
		super(rollNo, name);
		// TODO Auto-generated constructor stub
	}

	public CommerceStudent(int rollNo, String name, String majorSubject, String collegeName) {
		super(rollNo, name);
		this.majorSubject = majorSubject;
		this.collegeName = collegeName;
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return ""+super.toString()+"\tMajor Subject=" + majorSubject + "\tCollege Name=" + collegeName;
	}
	
	public boolean equals(Student x) {
		// TODO Auto-generated method stub
		
		return (this.getMajorSubject()==((CommerceStudent) x).getMajorSubject()) &&
				(this.getCollegeName()==((CommerceStudent) x).getCollegeName()) &&
				super.equals(x);
	}
	
}

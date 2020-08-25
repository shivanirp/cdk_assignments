package studentAssignment;

public class EnggStudent extends Student {

	private String stream;
	private String collegeName;
	
	public EnggStudent(int rollNo, String name) {
		super(rollNo, name);
		// TODO Auto-generated constructor stub
	}

	public EnggStudent(int rollNo, String name, String stream, String collegeName) {
		super(rollNo, name);
		this.stream = stream;
		this.collegeName = collegeName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		
		return ""+super.toString()+"\tStream=" + stream + "\tCollege Name=" + collegeName;
	}
	
	public boolean equals(Student x) {
		// TODO Auto-generated method stub
		
		return (this.getStream().equals(((EnggStudent) x).getStream())) &&
				(this.getCollegeName().equals(((EnggStudent) x).getCollegeName())) &&
				super.equals(x);
	}
}

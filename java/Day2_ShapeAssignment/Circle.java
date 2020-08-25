package ShapeAssignment;

public class Shape {
	
	private String name;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name=" + name;
	}
	
}

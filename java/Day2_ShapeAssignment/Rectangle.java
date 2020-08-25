package ShapeAssignment;


public class Rectangle extends Shape implements Calculatable {

	private int length;
	private int breadth;
	
	public Rectangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}

}

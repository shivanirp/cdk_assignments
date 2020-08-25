package ShapeAssignment;

public class Square extends Shape implements Calculatable{

	private int side;
	
	
	public Square(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super("Square");
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

}

package ShapeAssignment;

public class TestCalculatable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculatable c1=new Circle(10);
		System.out.println("\nArea of Circle : "+c1.area());
		System.out.println("Perimeter of Circle : "+c1.perimeter());
		
		c1=new Rectangle(6,4);
		System.out.println("\nArea of Rectangle : "+c1.area());
		System.out.println("Perimeter of Rectangle : "+c1.perimeter());
		
		c1=new Square(10);
		System.out.println("\nArea of Square : "+c1.area());
		System.out.println("Perimeter of Square : "+c1.perimeter());
		

	}

}

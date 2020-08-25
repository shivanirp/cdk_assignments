package ShapeAssignment;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculatable c1=new Circle(10);
		System.out.println("\nArea of Circle : "+c1.area());
		System.out.println("Perimeter of Circle : "+c1.perimeter());
		
		Calculatable c2=new Rectangle(6,4);
		System.out.println("\nArea of Rectangle : "+c2.area());
		System.out.println("Perimeter of Rectangle : "+c2.perimeter());
		
		Calculatable c3=new Square(10);
		System.out.println("\nArea of Square : "+c3.area());
		System.out.println("Perimeter of Square : "+c3.perimeter());
		
	}

}

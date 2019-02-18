
public class TestPintapplication {

	public static void main(String[] args) 
	{
	Circle circle1 = new Circle(6);	
	Circle circle2 = new Circle(4);
	Circle circle3 = new Circle(3);
	
	circle1.drawShape();
	System.out.println("area of circle:"+circle1.calcArea());
	
	circle2.drawShape();
	System.out.println("area of circle:"+circle2.calcArea());
	
	circle3.drawShape();
	System.out.println("area of circle:"+circle3.calcArea());
	}

}

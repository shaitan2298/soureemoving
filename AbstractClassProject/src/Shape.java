
public abstract class Shape {
int rad;
String shapeType;
	public Shape(String shapeType,int rad)
	{
		this.rad=rad;
		this.shapeType=shapeType;
	}
	public void drawShape()
	{
		System.out.println(shapeType+"Drawn with RED color");
	}
	public abstract float calcArea();
}

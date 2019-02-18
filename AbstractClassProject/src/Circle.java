
public class Circle extends Shape 
{
	public Circle(String shapeType,int rad)
	{
		super ("Circle",rad);
	}
public float calcArea()
{
	return (float)(Math.PI*rad*rad);
	}
public float calcCircumference()
{
	return (float)(2*Math.PI*rad*rad);
	}
}

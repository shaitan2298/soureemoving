import java.util.Scanner;
public class Sphere 
{
	public Sphere(String shapeType,int rad)
	{
		super("Sphere",rad);
	}
	public float calcArea()
	{
		return(float)(4*Math.PI*rad*rad);
	}
		public float calVolume()
		{
			return(float)((4/3)*Math.PI*rad*rad*rad);
		}
	}



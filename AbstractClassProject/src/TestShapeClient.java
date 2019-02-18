import java.util.Scanner;


public class TestShapeClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shaps[]=new Shape[4];
		int choice;
		for(int i=0;i<shaps.length;i++)
		{
			System.out.println("Which shapes do you want?");
			System.out.println("enter 1:Circle \t 2:Sphere");
			choice=sc.nextInt();
			System.out.println("Enter radius");
			int rad=sc.nextInt();
			switch(choice)
			{
			case 1: shaps[i]=new Circle(rad,"Circle");
			
			break;
			case 2: shaps[i]=new Sphere(rad,"Sphere");
			
			break;
			default: shaps[i]=new Circle(rad,"Circle");
			
			break;
			
			}
			
		}
		System.out.println("************************");
		for(int j=0;j<shape.length;j++)
		{
			shape[j].drawshape();
			if(shape[j] instanceof Circle)
			{
				System.out.println(shape[j].drawshape());
				System.out.println(((Circle)shape[j].calCircumference()));
				
			}
			else if(shape[j] instanceof Sphere)
			{System.out.println("*************Sphere************");
				System.out.println(shape[j].drawshape());
				System.out.println(((Sphere)shape[j].calVolume()));
				
			}
		}
	}

}

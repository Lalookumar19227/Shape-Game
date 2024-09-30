package shape_project;
import java.util.Scanner;
public class Game {
	Game()
	{
		System.out.println("Welcome To Game!");
		System.out.println("Game is now Started!!");
	}
	public int selectShape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===Press 1 for 2-D Shape====");
		System.out.println("===Press 2 for 3-D Shape====");
		int x=sc.nextInt();
		if(x==1) {
			System.out.println("You have selected 2-D Shape");
			return x;
		}
		else if(x==2) {
			System.out.println("You have selected 3-D Shape");
			return x;
		}
		else {
			System.out.println("This is not a valid choice!");
			System.out.println("Please select from right Options!!");
			return selectShape();
		}
	}
	
	public TwoDShape selectTwoDShape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===Press 1 for Circle====");
		System.out.println("===Press 2 for Rectangle====");
		System.out.println("===Press 3 for Triangle====");
		System.out.println("===Press 4 for Square====");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
					System.out.println("You have selected Circle");
					System.out.println("ENter the Radius");
					double r=sc.nextDouble();
					//Circle c1=new Circle(r);
					return new Circle(r);
			case 2:
				System.out.println("You have selected rectangle");
				//System.out.println("ENter the length");
				//System.out.println("ENter the width");
				return new Rectangle();
				
			case 3:
				System.out.println("You have selected Triangle");
				return new Triangle();
				
			case 4: 
				System.out.println("You have selected Square");
				return new Square();
			default:
				System.out.println("This is not the Right Choice");
				System.out.println("Please select from right options");
				return selectTwoDShape();
		}
		
	}
	public ThreeDShape selectThreeDShape()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===Press 1 for Cylinder====");
		System.out.println("===Press 2 for Sphere====");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
					System.out.println("You have selected Cylinder");
					
					return new Cylinder();
			case 2:
				System.out.println("You have selected Sphere");
				
				return new Sphere();
				
			default:
				System.out.println("This is not the Right Choice");
				System.out.println("Please select from right options");
				return selectThreeDShape();
		}
		
	}
	
	

}










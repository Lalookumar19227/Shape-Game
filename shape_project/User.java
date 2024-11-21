package shape_project;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char c;
		do {
		int choice=g.selectShape();
		System.out.println("Choice is: "+choice);
		switch(choice)
		{
			case 1: 
			TwoDShape t1=g.selectTwoDShape();
			t1.getArea();
			t1.getPerimeter();
			break;
				
			case 2: 
				ThreeDShape t2=g.selectThreeDShape();
				t2.getVolume();
				t2.getLateralSurfaeArea();
				t2.getTotalSurfaeArea();
				break;
		}
			System.out.println("hellooooooo");
			System.out.println("hellooooooo");
			System.out.println("hellooooooo");
			System.out.println("hellooooooo");
			System.out.println("hellooooooo");


		System.out.println("Press Y/y to continue or other cgaracter to EXIT!!");
		c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("Thank Yopu for Playing the Game!!");
		System.out.println("Have a Good Day!!");
	}

}

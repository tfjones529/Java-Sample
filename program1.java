import java.util.Scanner;
public class program1 {
	//Tyreek Jones CSCI 140-2
	//Date Started: 2/2/17 Due: 2/5/17
	//The user will be able to calculate area and diameter
	public static void main(String[] args) 
	{Scanner in = new Scanner (System.in);
		//Declarations 
	double length, width, pi, rad, area, area2, diameter;
	;
	pi = 3.14;
	//Code
	System.out.print("Enter the length of your rectangle: ");
	length = in.nextDouble();
	System.out.print("Enter the width of your rectangle: ");
	width = in.nextDouble();
	area = length*width;
	System.out.println ("Length of rectangle: " + length);
	System.out.println("Width of rectangle: " + width);
	System.out.println("The area of your rectangle is: " + area);
	System.out.print("Enter the radius of your cirlce: ");
	rad = in.nextDouble();
	diameter= rad*2;
	area2 = pi*rad*rad;	
	System.out.println("Radius of your circle: " + rad);
	System.out.println("Diameter of your circle is : " + diameter);
	System.out.println("The area of your circle is : " + area2);	
		

	}

}

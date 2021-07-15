package src.srccode.clculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[] args) {
		Figure tri = new TriangleAreaCalculator();
		Figure squ = new SquareAreaCalculator();
		Figure cir = new CircleAreaCalculator();
		Figure rec = new RectangleAreaCalculator();
		Figure rightTriangle = new RightTriangleAreaCalculator();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Area Calculator!" + "\nEnter 1 to find the area of a Rectangle,"
				+ "\nEnter 2 to find the area of a Square," + "\nEnter 3 to find the area of a Triangle,"
				+ "\nEnter 4 to find the area of a Circle" + "\nEnter 5 to find area of the Right Triangle.");
		System.out.println("If you wanna find Perimeter of a Rectangle press 6,"
				+ "\npress 7 if you want to find Perimeter of a Square,"
				+ "\npress 8 if you want to find Perimeter of a Triangle,"
				+ "\npress 9 if you want to find Perimeter of a Circle, and "
				+ "\npress 10 if you want to fine Perimeter of a Right Triangle.");
		try {
			int userInput = scanner.nextInt();
			switch (userInput) {
			case 1:
				System.out.println(rec.getArea(scanner));
				break;
			case 2:
				System.out.println(squ.getArea(scanner));
				break;
			case 3:
				System.out.println(tri.getArea(scanner));
				break;
			case 4:
				System.out.println(cir.getArea(scanner));
				break;
			case 5:
				System.out.println(rightTriangle.getArea(scanner));
				break;
			case 6:
				System.out.println(rec.getPerimeter(scanner));
				break;
			case 7:
				System.out.println(squ.getPerimeter(scanner));
				break;
			case 8:
				System.out.println(tri.getPerimeter(scanner));
				break;
			case 9:
				System.out.println(cir.getPerimeter(scanner));
			case 10:
				System.out.println(rightTriangle.getPerimeter(scanner));
			default:
				System.out.println(
						"You entered an incorrect value to perform the calculation. Please enter correct value.\n");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
		} finally {
			main(args);
		}
	}

}

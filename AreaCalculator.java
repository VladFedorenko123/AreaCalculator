package src.srccode.clculator;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Figure tri = new TriangleAreaCalculator();
		Figure squ = new SquareAreaCalculator();
		Figure cir = new CircleAreaCalculator();
		Figure rec = new RectangleAreaCalculator();
		Figure rightTriangle = new RightTriangleAreaCalculator();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Welcome to the Area Calculator! Enter 1 to find the area of a Rectangle, Enter 2 to find the area of a Square, \nEnter 3 to find the area of a Triangle or Enter 4 to find the area of a Circle and Enter 5 to find area of the Right Triangle");

		do {
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
			default:
				System.out.println(
						"You entered an incorrect value to perform the calculation. Please enter correct value");
				break;
			}
		} while (true);
	}

}

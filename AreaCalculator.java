package src.srccode.clculator;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Figure tri = new TriangleAreaCalculator();
		Figure squ = new SquareAreaCalculator();
		Figure cir = new CircleAreaCalculator();

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Welcome to the Area Calculator! Enter 1 to find the area of a Rectangle, Enter 2 to find the area of a Square, \nEnter 3 to find the area of a Triangle or Enter 4 to find the area of a Circle and Enter 5 to find area of the Right Triangle");

		int userInput = Integer.parseInt(scanner.next());
		switch (userInput) {
		case 1:
			squ.rectangle(scanner, squ);
			break;
		case 2:
			squ.square(scanner);
			break;
		case 3:
			tri.triangle(scanner);
			break;

		case 4:
			cir.circle(scanner);
			break;
		case 5:
			tri.rightTriangle(scanner);
			break;
		}

	}

}

package src.srccode.clculator;

import java.util.Scanner;

public class RectangleAreaCalculator implements Figure {

	@Override
	public String getArea(Scanner scanner) {
		System.out.println("Please enter the length of the rectangle: ");
		int length = scanner.nextInt();
		System.out.println("Please enter the width of the rectangle: ");
		int width = scanner.nextInt();

		return  Integer.toString(length * width);
	}
}

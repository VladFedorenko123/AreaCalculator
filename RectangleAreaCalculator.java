package src.srccode.clculator;

import java.util.Scanner;

public abstract class RectangleAreaCalculator implements Figure {
	public void getAreaRectangle(Scanner scanner, Figure fig) {
		System.out.println("Please enter the length of the rectangle: ");
		int length = scanner.nextInt();
		System.out.println("Please enter the width of the rectangle: ");
		int width = scanner.nextInt();

		System.out.println(length * width);
	}
}

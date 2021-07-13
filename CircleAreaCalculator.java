package src.srccode.clculator;

import java.util.Scanner;

public class CircleAreaCalculator extends RectangleAreaCalculator {
	@Override
	public String getArea(Scanner scanner) {
		System.out.println("Please enter the radius of the circle: ");
		int radius = scanner.nextInt();

		return Double.toString((Math.PI * (radius * radius)));
	}

}

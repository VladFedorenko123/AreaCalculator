package src.srccode.clculator;

import java.util.Scanner;

public class CircleAreaCalculator extends AbstractRectangleAreaCalculator {
	@Override
	public void circle(Scanner scanner) {
		System.out.println("Please enter the radius of the circle: ");
		int radius = scanner.nextInt();
		scanner.close();

		System.out.println(Math.PI * (radius * radius));
	}

	@Override
	public void triangle(Scanner scanner) {
	}

	@Override
	public void square(Scanner scanner) {
	}

	public void rightTriangle(Scanner scanner) {
	}

}

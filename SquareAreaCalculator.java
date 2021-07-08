package src.srccode.clculator;

import java.util.Scanner;

public class SquareAreaCalculator extends AbstractRectangleAreaCalculator {

	@Override
	public void square(Scanner scanner) {
		System.out.println("Please enter the length of a side: ");
		int lengthOfASide = scanner.nextInt();
		scanner.close();

		System.out.println(lengthOfASide * lengthOfASide);
	}

	@Override
	public void triangle(Scanner scanner) {
	}

	@Override
	public void circle(Scanner scanner) {
	}

	public void rightTriangle(Scanner scanner) {
	}
}

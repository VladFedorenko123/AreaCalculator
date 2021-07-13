package src.srccode.clculator;

import java.util.Scanner;

public class SquareAreaCalculator implements Figure {

	@Override
	public String getArea(Scanner scanner) {
		System.out.println("Please enter the length of a side: ");
		int lengthOfASide = scanner.nextInt();

		return Integer.toString(lengthOfASide * lengthOfASide);
	}

}

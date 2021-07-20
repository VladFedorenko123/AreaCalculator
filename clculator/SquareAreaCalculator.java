package src.srccode.clculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareAreaCalculator implements Figure, Perimeter {
	private int lengthOfASide;
	private boolean restart = true;

	@Override
	public double getArea(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the length of a side: ");
				lengthOfASide = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}
		return lengthOfASide * lengthOfASide;
	}

	@Override
	public double getPerimeter(Scanner scanner) {
		while (restart) {
			try {
				System.out.println("Please enter the length of a side: ");
				lengthOfASide = scanner.nextInt();
				restart = false;
			} catch (InputMismatchException e) {
				System.out.println("Error: You entered the wrong number. Please enter number againg.\n");
				scanner.next();
			}
		}
		return 4 * lengthOfASide;
	}
}

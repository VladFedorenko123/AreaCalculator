package src.srccode.clculator;

import java.util.Scanner;

public interface Figure {
	public void triangle(Scanner scanner);

	public void square(Scanner scanner);

	public void circle(Scanner scanner);

	public void rectangle(Scanner scanner, Figure fig);

	public void rightTriangle(Scanner scanner);
}

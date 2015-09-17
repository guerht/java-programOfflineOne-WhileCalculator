/*
 * Project: WhileCalculator.java
 * Description: A program that reports letter grades (and other things)
 * Author: Seunghoon Park
 * Date: 17 September, 2015
 */
import java.util.Scanner;
public class WhileCalculator {
	public static void main(String args[]) {
		double num1, num2;
		char operand = 'q';
		String input;
		Scanner scan = new Scanner(System.in);
		while (operand != 'x') {
			System.out.println("Enter the operand: \nA = Addition\tS = Subtraction\tM = Multiplication\tD = Division\tX = exit program");
			input = scan.next(); // get the operand
			operand = input.charAt(0); // store the operand as a character
			if (operand == 'x' || operand == 'X')
				break;
			System.out.println("Enter the first number: ");
			num1 = scan.nextDouble();
			System.out.println("Enter the second number: ");
			num2 = scan.nextDouble();
			switch (operand) {
				case 'A':
				case 'a':
					System.out.println(num1 + num2 + "\n");
					break;
				case 'S':
				case 's':
					System.out.println(num1 - num2 + "\n");
					break;
				case 'M':
				case 'm':
					System.out.println(num1 * num2 + "\n");
					break;
				case 'D':
				case 'd':
					System.out.println(num1 / num2 + "\n");
					break;
				default:
					System.out.println("Error: only enter A, S, M, D, or X!");
					break;
			}
		}
	}
}
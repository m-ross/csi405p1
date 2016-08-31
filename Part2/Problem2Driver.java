package csi405.Homework1.Part2;

import java.util.Scanner;

public class Problem2Driver {
	public static void main(String [] args) {
		// declarations
		Scanner inKb = new Scanner(System.in); // keyboard input
		int dividend, divisor, remainder; // for multiple() and remainder() functions
		double x1, x2, y1, y2, distance; // for distance() function
		boolean result; // for multiple() function

		// body
		System.out.printf("Enter an integer to divide: ");
		dividend = inKb.nextInt(); // get an int from keyboard
		System.out.printf("Enter an integer to divide the previous by: ");
		divisor = inKb.nextInt(); // get an int from keyboard
		result = HW1Problem2.multiple(dividend, divisor); // find if dividend is divisible by divisor
		System.out.printf("%d is%s divisible by %d.\n", dividend, result ? "" : " not", divisor); // second argument is "" if result is false, otherwise it's " not"

		System.out.printf("\nEnter an integer to divide by 7: ");
		dividend = inKb.nextInt(); // get an int from keyboard
		remainder = HW1Problem2.remainder(dividend); // get remainder of dividend divided by 7
		System.out.printf("The remainder of %d divided by 7 is %d.\n", dividend, remainder);

		System.out.printf("\nEnter the x and y coordinates of a point: \n");
		x1 = inKb.nextDouble(); // get a double from keyboard
		y1 = inKb.nextDouble(); // get a double from keyboard
		System.out.printf("Enter the x and y coordinates of another point: \n");
		x2 = inKb.nextDouble(); // get a double from keyboard
		y2 = inKb.nextDouble(); // get a double from keyboard
		distance = HW1Problem2.distance(x1, x2, y1, y2); // calculate distance between (x1, y1) and (x2, y2)
		System.out.printf("The distance between (%.02f, %.02f) and (%.02f, %.02f) is %.02f.\n\n", x1, y1, x2, y2, distance);

		HW1Problem2.flipCoins(10); // simulate 10 coin flips, printing the results

		inKb.close(); // close the Scanner
	}
}

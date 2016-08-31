package csi405.Homework1.Part2;

import java.security.SecureRandom;

public class HW1Problem2 {
	// this function takes two int arguments and returns a boolean true if the first is divisible by the second, else it returns false 
	public static boolean multiple(int dividend, int divisor) {
		// declarations
		boolean result = false;

		// if mod gives zero, then the dividend is divisible by divisor
		result = dividend % divisor == 0;

		return result;
	}

	// this function takes one int as an argument, divides the argument by 7 and returns the remainder of that division
	public static int remainder(int dividend) {
		// declarations
		int remainder = 0;

		// mod gives remainder of dividend / 7
		remainder = dividend % 7;

		return remainder;
	}

	// this function takes four doubles as arguments, with the first two representing coordinates along one 2D axis and the other two representing coordinates along the other 2D axis
	// the function calculates the distance between the points given by the coordinates and returns it
	public static double distance(double x1, double x2, double y1, double y2) {
		// get the distance between (x1, y1) and (x2, y2) by using hypot() to calculate the length of the hypotenuse of an hypothetical triangle
		return Math.hypot(Math.abs(x1 - x2), Math.abs(y1 - y2));
	}

	// this function takes an int as an argument, randomly generates a quantity equal to the argument of numbers between 0 and 1, and prints that a Coin ended up heads for every 1 and tails for every 0
	public static void flipCoins(int qtyCoins) {
		SecureRandom secureRandom = new SecureRandom();
		int result;

		for (int i = 0; i < qtyCoins; i++) { // loop # times = 
			result = secureRandom.nextInt(2); // nextInt(2) returns either 0 or 1
			System.out.printf("Coin flip resulted in %s.\n", result == 1 ? "heads" : "tails"); // final argument is "heads" if result is 1 and is "tails" otherwise
		}
	}
}

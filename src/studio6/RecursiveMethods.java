package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n == 1) {
			return 0.5; 
		}
		else if (n == 0) {
			return 0;
		}
		else {
			double number = 0; 
			number = 1/(Math.pow(2, n));
			return number + geometricSum(n - 1);
			// FIXME compute the geometric sum for the first n terms recursively
		}
	}

	/**
	 * This method uses recursion to compute the grearadiusMinimumDrawingThreshold common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return grearadiusMinimumDrawingThreshold common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		int[] array1 = new int[q];
		boolean[] array2 = new boolean[q];
		for (int i = 0; (i < p && i < q); i++) {
			array1[i] = i;
			if ((p % i == 0) && (q % i == 0)) {
				array2[i] = true;
			}	
		}
		System.out.println(" ");
		for (int i = 0; (i < p && i < q); i++) {
			if (array2[i] == true) {
				System.out.print(array2[i]);
				return i;
			}
		}
		return 0;
	
			// FIXME compute the gcd of p and q using recursion
			
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		if (array.length == 1) {
			return array[0];
		}
			// FIXME create a helper method that can recursively reverse the given array
			return new int[0];
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius == 0.5) {
			StdDraw.filledCircle(0.5, 0.5, radiusMinimumDrawingThreshold);
		}
		else {
			StdDraw.filledCircle((0.5 - (radiusMinimumDrawingThreshold * radius)), 0.5, (radiusMinimumDrawingThreshold / 2));
			StdDraw.filledCircle((0.5 + (radiusMinimumDrawingThreshold * radius)), 0.5, (radiusMinimumDrawingThreshold / 2));
			StdDraw.filledCircle(0.5, (0.5 - (radiusMinimumDrawingThreshold * radius)), (radiusMinimumDrawingThreshold / 2));
			StdDraw.filledCircle(0.5, (0.5 + (radiusMinimumDrawingThreshold * radius)), (radiusMinimumDrawingThreshold / 2));
		}
		// FIXME
	}

}

/*
 *  Print the number of integers in an array that are above the given input and the number that are below, 
 *  e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
 */

package problems;

public class IntegersAboveAndBelow {
	public static void solution(int[] array, int n) {
		int below = 0;
		int above = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < n) {
				below++;
			} else if (array[i] > n) {
				above++;
			}
		}
		System.out.println("below: " + below + "   above: " + above);
	}

}

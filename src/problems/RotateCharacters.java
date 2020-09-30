/*
 * Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g. 
 * “MyString” rotated by 2 is “ngMyStri”
 */
package problems;

public class RotateCharacters {
	public static void solution(String s, int k) {
		if (k <= s.length() && k >= 0) {
			String shiftedchars = s.substring(s.length() - k, s.length());
			StringBuilder sb = new StringBuilder(shiftedchars);
			sb.append(s.substring(0, s.length() - k));
			System.out.println(sb);
		} else {
			System.out.println("the number " + k + " is greather or less than the length of the string."
					+ "\n please pick another rorating number.");
		}

	}

}

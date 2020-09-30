import problems.IntegersAboveAndBelow;
import problems.RotateCharacters;

public class Driver {
	private static String mystring = "MyString";
	private static int n=4;
	private static int k=5;
	private static int[] array = {1, 5, 2, 1, 10};
	private static IntegersAboveAndBelow integersbelowandabove;
	private static RotateCharacters rotatecharacters;
	
	public static void main(String[] args) {
		integersbelowandabove.solution(array, n);
		rotatecharacters.solution(mystring, k);
	}

}

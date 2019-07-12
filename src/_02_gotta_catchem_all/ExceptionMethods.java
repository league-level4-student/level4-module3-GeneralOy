package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double Num, double Denom) {
		if (Denom == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return Num / Denom;
		}

	}

	public static String reverseString(String orgString) {
		String reversing = orgString.trim();

		// char[] revLetters;
		if (reversing.isEmpty()) {
			throw new IllegalStateException();
		} else {
			String reversedString = Character.toString(reversing.charAt(reversing.length() - 1));
			/*
			 * for (char letters : reversing.toCharArray()) {
			 * reversedString.concat(Character.toString(letters)); }
			 */
			reversing = reversing.substring(0, reversing.length() - 1);
			for (int i = reversing.length(); i > 0; i--) {
				reversedString = reversedString.concat(reversing.substring(i - 1, i));
				reversing = reversing.substring(0, (i));
			}
			return reversedString;
		}

	}
}

package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double Num, double Denom) {
		if (Denom == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return Num / Denom;
		}

	}
}

package w2;

public class PolarCoordinates {
	public static void main(String[] args) {
		double dbl0 = Double.parseDouble(args[0]);
		double dbl1 = Double.parseDouble(args[1]);
		double r = Math.sqrt((dbl0 * dbl0) + (dbl1 * dbl1));
		double theta = Math.atan2(dbl1, dbl0);
		System.out.println(r);
		System.out.println(theta);
	}
}

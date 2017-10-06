package w1;

public class XYintoAngle {
	public static void main(String[] args) {
		double startx = StdIn.readDouble();
		double starty = StdIn.readDouble();
		double x1 = StdIn.readDouble();
		double y1 = StdIn.readDouble();
		double x = x1-startx;
	    double y = y1-starty;
	    double length = Math.sqrt(x*x+y*y); 
		if (x >= 0) {
			if (y >= 0) {
				double angle = 90-(Math.atan2(y, x) / Math.PI * 180);
				System.out.println(angle);
			}
			if (y < 0) {
				double angle = 90-(Math.atan2(y, x) / Math.PI * 180);
				System.out.println(angle);
			}
		}
		if (x < 0) {
			if (y >= 0) {
				double angle = 450-(Math.atan2(y, x) / Math.PI * 180);
				System.out.println(angle);
			}
			if (y < 0) {
				double angle = 90-(Math.atan2(y, x) / Math.PI * 180);
				System.out.println(angle);	
			}
		}
		System.out.println(length);
	}
}

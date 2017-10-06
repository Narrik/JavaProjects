package w2;

public class SaferDivider {
	public static void main(String[] args){
		double a =Double.parseDouble(args[0]);
		double b =Double.parseDouble(args[1]);
		if (b!=0)
		System.out.println(a/b);
		else
	    System.out.println("I can't divide by zero!");
	}
}

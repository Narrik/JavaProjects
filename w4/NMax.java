package w4;

public class NMax {
	public static int max(int a, int b, int c){
	if (a>b && a>c)
		return a;
	else if (b>a && b>c)
		return b;
	else return c;
	}
	public static double max(double a, double b, double c){
		if (a>b && a>c)
			return a;
		else if (b>a && b>c)
			return b;
		else return c;
		}	
	public static void main(String[] args){
		double a =StdIn.readInt();
		double b =StdIn.readInt();
		double c =StdIn.readInt();
		System.out.println(max(a,b,c));
	}
	}
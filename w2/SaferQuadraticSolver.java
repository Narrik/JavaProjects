package w2;

public class SaferQuadraticSolver {
public static void main(String[] args){
	double a=Double.parseDouble(args[0]);
	double b=Double.parseDouble(args[1]);
	double c=Double.parseDouble(args[2]);
	if (a==0){
		System.out.println("Cannot solve equation");
	}
	else if (b*b-4*a*c<0)
		System.out.println("Equation is not solvable for real x");
	else {
		System.out.println((-b+Math.sqrt(b*b-4*a*c))/2*a);
		System.out.println((-b-Math.sqrt(b*b-4*a*c))/2*a);
	}
	}
}


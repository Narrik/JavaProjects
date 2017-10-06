package w4;

public class Factorial {
	static int facto = 1;
	public static int factorial (int N){
		if (N==1)
			return facto;
		else{
			facto*=N;
			return factorial(N-1);
		}
	}
	public static void main(String[] args){
		int a =StdIn.readInt();
		System.out.print(factorial(a));	
		}
		
	
}

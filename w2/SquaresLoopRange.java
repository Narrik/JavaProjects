package w2;

public class SquaresLoopRange {
public static void main(String[] args){
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	if (a>b)
		System.out.println("Start-limit greater than stop-limit!");
	else
	for (int i=a;i<b+1;i++)
		System.out.print(i*i+" ");
}
}

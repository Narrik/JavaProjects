package w2;

public class MultiplesLoopRange {
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		for (int i=a;i<b+1;i++)
			if (i%c==0)
			System.out.print(i+" ");
	}
}


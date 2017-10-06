package w3;

import java.util.Arrays;

public class TempMedian {
	public static void main(String[] args){
		int temp = 0;
		int[] tempArray = new int[args.length];
		for (int i =0;i<args.length;i++){
			if (args[i].equals("+")){
				temp+=1;
				tempArray[i]=temp;
				System.out.print(temp+" ");
			} else if (args[i].equals("-")){
				temp-=1;
				tempArray[i]=temp;
				System.out.print(temp+" ");
			} else if (args[i].equals(".")){
				tempArray[i]=temp;
				System.out.print(temp+" ");
			} else{
				temp=Integer.parseInt(args[i]);
				tempArray[i]=temp;
				System.out.print(temp+" ");
			}
		}
		System.out.println("");
		Arrays.sort(tempArray);
		System.out.println(Arrays.toString(tempArray));
		double median = 0;
		if (args.length%2==0){
			median = (double) (tempArray[(args.length/2)-1]+tempArray[((args.length/2))]) / 2;
		} else
			median = (tempArray[(args.length/2)]);
			System.out.println(median);
	}
}

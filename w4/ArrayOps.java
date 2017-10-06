package w4;

import java.util.Arrays;

public class ArrayOps {
	public static double findMax(double[] data){
		double max = data[0];
		for (int i=1; i<data.length;i++){
		if (data[i-1]<data[i]) 
		max =data[i];
		}
		return max;
		}
	public static void normaliseInPlace(double[] data){
		double sum = 0;
		for (int i = 0 ;i<data.length;i++){
			sum+=data[i];
		}
		
		if (sum!=1)
			for (int i=0;i<data.length;i++)
				data[i]=data[i]/sum;
	}
	public static void reverseInPlace(double[] data){
		double h =0;
		for (int i=0;i<data.length/2;i++){
			h=data[i];
			data[i]=data[data.length-i-1];
			data[data.length-i-1]=h;
		}
		}
	public static void swap(double[] data1, double[] data2){
		double h =0;
		for (int i=0;i<data1.length;i++){
			h=data1[i];
			data1[i]=data2[i];
			data2[i]=h;
	}
}
	public static void main(String[] args){
		double a =StdIn.readDouble();
		double b =StdIn.readDouble();
		double c =StdIn.readDouble();
		double d =StdIn.readDouble();
		double[] a1 ={a,b,c,d};
		double[] a2 ={4,5,6,7};
		System.out.println(findMax(a1));
		normaliseInPlace(a1);
		System.out.println(Arrays.toString(a1));
		reverseInPlace(a1);
		System.out.println(Arrays.toString(a1));
		swap(a1,a2);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}
package w3;


public class ArrayRotate {
	public static void main(String[] args){
		int[] nums = new int[args.length];
		for (int i=0;i<args.length;i++) {
			nums[i]=Integer.parseInt(args[i]);
		}
		int[] copy = new int[nums.length];
		for (int i=0;i<args.length;i++) {
			if (i==args.length-1)
				copy[i]=nums[0];
			else
			  	copy[i]=nums[i+1];
		}
		for (int i=0;i<copy.length;i++)
		System.out.print(copy[i]+" ");
	}
}

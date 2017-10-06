package w4;

public class ArrayFront9 {
	public static boolean arrayFront9 (int[] nums){
		boolean is9 = false;
		if (nums.length<=4){
			for (int i=0;i<nums.length;i++){
			 	if (nums[i]==9)
			 		is9 = true;
			}
		} else for (int i=0;i<4;i++)
			if (nums[i]==9)
		 		is9 = true;
		return (is9);
	}
	public static void main(String[] args){
		int N=args.length;
		int[] nums = new int[N];
		for (int i=0;i<args.length;i++)
			nums[i]=Integer.parseInt(args[i]);
		System.out.println(arrayFront9(nums));
	}
}

package w4;

public class Has271 {
	public static boolean has271(int[] nums){
		for (int i=1;i<nums.length;i++){
			if ((nums[i-1]+5==nums[i]) && (i+1!=nums.length) && (nums[i-1]-1==nums[i+1]))
			return true;
					}
		return false;
	}
	public static void main(String[] args){
		int N=args.length;
		int[] nums = new int[N];
		for (int i=0;i<args.length;i++)
			nums[i]=Integer.parseInt(args[i]);
	System.out.println(has271(nums));
	}
}

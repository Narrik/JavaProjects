package w4;

public class NoTriples {
	public static boolean noTriples(int[] nums){
		for (int i=1;i<nums.length;i++){
			if (nums[i-1]==nums[i]) 
				if (i+1!=nums.length)
					if (nums[i]==nums[i+1])
						return false;
				
			}
		return true;
		}
	public static void main(String[] args){
		int N=args.length;
		int[] nums = new int[N];
		for (int i=0;i<args.length;i++)
			nums[i]=Integer.parseInt(args[i]);
		System.out.println(noTriples(nums));
	}
}

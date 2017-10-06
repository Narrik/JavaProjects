package w3;
public class Mode {
	public static void main(String[] args){
		int[] count = new int[10];
		for (int i =0;i<args.length;i++){
			for (int j =0;j<10;j++){
				if (Integer.parseInt(args[i])==j)
					count[j]++;
			}
		}
		for (int j =0;j<10;j++){
			String dots = new String(new char[count[j]]).replace("\0", ".");
			if (count[j]>0)
			dots =" "+dots;
			System.out.println("["+j+"s: "+count[j]+"]"+dots);
		}
		int max = count[0];
		int mode = 0;
		for (int i=0;i<10;i++)
			if (max<count[i]){
			 max=count[i];
			 mode = i;
			}	
		System.out.println("Mode: "+mode);	
	}

}

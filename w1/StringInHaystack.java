package w1;

import java.util.Arrays;

public class StringInHaystack {
public static void main(String[] args){
	int position=0; 
	String str = "1234";
	for (int i=0;i<args.length;i++){
		String word = args[i];
		if (word.equals("write")){
		position = i;
		//break;
		}
	}
	System.out.println(position);
	System.out.println(str.substring(1,2));
	System.out.println(str.substring(2,4));
	System.out.println(Arrays.toString(str.split("2")));
	System.out.println((new String[] {"other"}).length);
	}

}

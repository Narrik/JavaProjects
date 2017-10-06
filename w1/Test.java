package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Test {
	public static void main(String[] args){
		Map<String,Integer> m = new HashMap<>();
		m.put("hi",2);
		m.put("yo",3);
		for(Map.Entry<String,Integer> e:m.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
		List<Integer> OrigList = new ArrayList<>();
		Map<Boolean,List<Integer>> SplitMap = OrigList.stream().collect(Collectors.groupingBy(x->x<5));
		for(Map.Entry<Boolean,List<Integer>> e:SplitMap.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}	
			
	}
}

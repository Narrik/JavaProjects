package w7;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class WordCounter {
	private ArrayList<Integer> lengths = new ArrayList<Integer>();
	public WordCounter(String[] tokens){
		wordLengthFreq(tokens);
	}

	// Class constructor. When a WordCounter is created, it calls
	// wordLengthFreq() on the input tokens.
	public void wordLengthFreq(String[] tokens){
		lengths.clear();
		if (tokens.length != 0){
		for (int i = 0;i<tokens.length;i++){
			lengths.add(tokens[i].length());
		}
		}
		
	}

	// Replace the object’s frequency distribution with information about the
	// lengths of the strings in tokens.
	public HashMap<Integer, Integer> getFreqDist() {
		HashMap<Integer, Integer> h1 = new HashMap<Integer,Integer>();
		if (!lengths.isEmpty()){
		for (int i = 0;i<lengths.size();i++){
			if (h1.containsKey(lengths.get(i))){
				h1.put(lengths.get(i), h1.get(lengths.get(i))+1);
			}
			else h1.put(lengths.get(i), 1);
		}
		}
		return h1;
	}

	// Returns the frequency distribution as a HashMap.
	public int maxVal() {
		int maxVal = 0;
		for (int i : getFreqDist().keySet()){
			if (maxVal < getFreqDist().get(i)){
				maxVal = getFreqDist().get(i);
			}
			
		}
		return maxVal;
	}

	// Returns the highest value in the frequency distribution.
	public double[] map2array() {
		int arraysize;
		 if (lengths.isEmpty()){
			 arraysize = 0;
		 }
		 else arraysize = (Collections.max(lengths)+1); 
		double[] arrays = new double[arraysize];
		for (int i : getFreqDist().keySet()){
			arrays[i] = ((getFreqDist().get(i))*100/((double) maxVal()));
		}
		return arrays;
	}
	// Convert the frequency distribution to a normalized array of doubles. Each
	// (integer) key of the frequency distribution corresponds to an index into
	// the array, and the value for that key corresponds to the element at the
	// index. Convert the values into percentages (where the maximum value of
	// the distribution is 100%).
	public static void main(String[] args){
		Tokenizer tokenizer = new Tokenizer("melville-moby_dick.txt");
		String[] tokens = tokenizer.getTokens();

		WordCounter wordCounter = new WordCounter(tokens);
		System.out.println(wordCounter.getFreqDist());
		double[] points = wordCounter.map2array();

		int n = points.length;
		StdDraw.clear();
		StdDraw.setXscale(0, n - 1);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(0.5 / n);
		for (int i = 0; i < n; i++) {
		    StdDraw.line(i, 0, i, points[i]);
	}
}
}


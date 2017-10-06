package w7;

public class Interval {
	private double left;
	private double right;
	public Interval(double left, double right){
		this.left = left;
		this.right = right;
	}
	public boolean doesContain(double x){
		if (x>=left && x<=right && !isEmpty()){
			return true;
		}
		else return false;
	}
	public boolean isEmpty(){
		if (left>right){
			return true;
		}
		else return false;	
	}
	public boolean intersects(Interval b){
		if (doesContain(b.left) || doesContain(b.right)){
			return true;
		}
		else return false;
	}
	public String toString(){
		if (isEmpty()){
		return ("Interval: (EMPTY)");	
		}
		else return ("Interval: ["+left+", "+right+"]");
	}
}

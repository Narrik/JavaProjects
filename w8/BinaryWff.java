package w8;

public class BinaryWff {

	private PropVar left;
	private PropVar right;
	private Operator op = null;

	public BinaryWff(PropVar left, PropVar right) {
		this.left = left;
		this.right = right;
	}

	public void setOp(Operator op) {
		this.op = op;
	}

	public Operator getOp() {
		return op;
	}

	public PropVar getLeft() {
		return left;
	}

	public PropVar getRight() {
		return right;
	}

	public String toString() {
		return ("("+left+" "+op+" "+right+")");
	}
	// Return a string of the form (<left> <op> <right>).
}

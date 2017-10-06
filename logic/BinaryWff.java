package logic;

import w8.Operator;

public abstract class BinaryWff extends Wff {
	
	private Wff left;
	private Wff right;
	private Operator op = null;

	
	public BinaryWff(Wff left, Wff right) {
		this.left = left;
		this.right = right;
	}

	public void setOp(Operator op) {
		this.op = op;
	}

	public Operator getOp() {
		return op;
	}

	public Wff getLeft() {
		return left;
	}

	public Wff getRight() {
		return right;
	}

	public String toString() {
		return ("("+left+" "+op+" "+right+")");
	}
	// Return a string of the form (<left> <op> <right>).
}

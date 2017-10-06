package logic;

import w8.Operator;

public class OrWff extends BinaryWff {
	public OrWff(Wff left, Wff right){
		super(left,right);
		setOp(Operator.OR);
	}
	//Class constructor.
	public boolean eval(Valuation val){
		return (getLeft().eval(val) || getRight().eval(val));
}
}

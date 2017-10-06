package logic;

import w8.Operator;

public class AndWff extends BinaryWff {
	public AndWff(Wff left, Wff right){
		super(left,right);
		setOp(Operator.AND);
	}
	//Class constructor.
	public boolean eval(Valuation val){
		return (getLeft().eval(val) && getRight().eval(val));
	}

}

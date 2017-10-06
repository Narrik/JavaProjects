package mock;

public class ComplexNumbers {
	public static double[] complexAdd(double[] z1, double[] z2) {

		double[] add = new double[2];
		add[0] = z1[0] + z2[0];
		add[1] = z1[1] + z2[1];
		return add;
	}

	public static double[] complexConjugate(double[] z) {
		double[] conj = new double[2];
		conj[0] = z[0];
		if (z[1] == 0) {
			conj[1] = z[1];
		} else {
			conj[1] = -z[1];
		}
		return conj;
	}

	public static double[] complexMultiply(double[] z1, double[] z2) {
		double[] prod = new double[2];
		prod[0] = (z1[0] * z2[0]) - (z1[1] * z2[1]);
		prod[1] = (z1[1] * z2[0]) + (z1[0] * z2[1]);
		return prod;
	}

	public static double[] complexReciprocal(double[] z) {
		double[] recip = new double[2];
		recip[0] = z[0] / (Math.pow((z[0]), 2) + Math.pow((z[1]), 2));
		recip[1] = -z[1] / (Math.pow((z[0]), 2) + Math.pow((z[1]), 2));
		return recip;
	}

	public static String toString(double[] z) {
		if (z[1] < 0 && z[0] != 0.0) {

			String s = String.format("%.1f%.1fi", z[0], z[1]);
			return s;
		} else if (z[1] == 0.0)

		{
			String s = String.format("%.1f", z[0]);
			return s;
		} else if (z[0] == 0.0) {
			String s = String.format("%.1fi", z[1]);
			return s;
		} else if (z[0] == 0.0 && z[1] == 0.0) {
			String s = String.format("%.1f", z[0]);
			return s;
		} else {
			String s = String.format("%.1f+%.1fi", z[0], z[1]);
			return s;
		}

	}

	public static double[][] sortByMagnitude(double[][] complexList) { // using
																		// COMPARATOR
		/*
		 * double[][] compList = new double[complexList.length][2]; for (int
		 * i=0;i<compList.length;i++){ compList[i][0] = complexList[i][0];
		 * compList[i][1] = complexList[i][1]; } ArrayList<double[]> ar = new
		 * ArrayList<>(); for (double[] a:compList){ ar.add(a); }
		 * Comparator<double[]> c = new Comparator<double[]>(){
		 * 
		 * @Override public int compare(double[] o1, double[] o2) { // TODO
		 * Auto-generated method stub } }; ar.sort(c); } } }
		 * if(Math.sqrt(o1[0]*o1[0])<Math.sqrt(o2[0]*o2[0])) return -1; else
		 * return 1; double[][] fin = new double[compList.length][2]; for (int
		 * i=0;i<ar.size();i++){ fin[i][0] = ar.get(i)[0]; fin[i][1] =
		 * ar.get(i)[1]; } return fin;
		 */
		// using BUBBLE COMPARING
		double[] magnitudes = new double[complexList.length];
		for (int i = 0; i < magnitudes.length; i++) {
			magnitudes[i] = Math.sqrt(Math.pow(complexList[i][0], 2) + Math.pow(complexList[i][1], 2));
		}
		// trying to find magnitudes and position them in the sorted list
		for (int i = 0; i < complexList.length; i++) {
			for (int j = 0; j < complexList.length - 1; j++) {
				if (magnitudes[j] > magnitudes[j + 1]) {
					double[] temp = complexList[j + 1];
					double magnitudesTemp = magnitudes[j + 1];
					complexList[j + 1] = complexList[j];
					magnitudes[j + 1] = magnitudes[j];
					complexList[j] = temp;
					magnitudes[j] = magnitudesTemp;
				}
			}
		}
		return complexList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] z1 = new double[2];
		double[] z2 = new double[2];
		z1[0] = Double.parseDouble(args[0]);
		z1[1] = Double.parseDouble(args[1]);
		z2[0] = Double.parseDouble(args[2]);
		z2[1] = Double.parseDouble(args[3]);
		// do not need this if in order to a implemented into toString()

		System.out.println("(" + toString(complexAdd(z1, z2)) + ")");
		System.out.println("(" + toString(complexConjugate(z1)) + ")");
		System.out.println("(" + toString(complexMultiply(z1, z2)) + ")");
		System.out.println("(" + toString(complexReciprocal(z1)) + ")");
		System.out.println("(" + toString(complexConjugate(complexAdd(z1, z2))) + ")");
		System.out.println();
		System.out.println(toString(new double[] { 1.0, 2.0 }));
		// should return "1.0+2.0i", 
		System.out.println(toString(new double[] { 5.6666,-7.12 }));
		// should return "5.7-7.1i" 
		System.out.println(toString(new double[] { -3.355,-1.0 })); 
		// should return "-3.4-1.0i"
		 System.out.println(toString(new double[] { -1.0, 0.0 }));
		// should return "-1.0"
		System.out.println(toString(new double[] { 0.0, -3.45 }));
		// should return "-3.5i" 
		System.out.println(toString(new double[] { 0.0, 0.0}));
		// should return "0.0"
		// this needs for because of bad output
		System.out.println(sortByMagnitude(new double[][] { { 5.0, -2.0 }, { 1.0, 2.0 }, { 0.0, 0.0 } }));
	}
}

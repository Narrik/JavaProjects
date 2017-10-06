package w3;

public class MeanVariance {
	public static void main(String[] args){
		double sumMean=0,sumVariance = 0;
		for (int i =0;i<args.length;i++)
			sumMean +=Double.parseDouble(args[i]);
		double mean = sumMean/args.length;
		for (int i =0;i<args.length;i++)
			 sumVariance+=Math.pow((Double.parseDouble(args[i])-mean),2);
		double variance = sumVariance/args.length;
		System.out.println(mean);
		System.out.println(variance);
	}

}

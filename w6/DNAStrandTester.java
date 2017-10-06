package w6;

public class DNAStrandTester {
	public static void summarise(DNAStrand dna) {
	    System.out.println("Original DNA Sequence: " + dna);
	    if (dna.isValidDNA()) {
	        System.out.println("Is valid");
	        System.out.println("Complement: " + dna.complementWC());
	        System.out.println("WC Palindrome: " + dna.palindromeWC());
	    } 
	    else {
	        System.out.println("Not Valid DNA");
	    }
	}
	private static DNAStrand agtc = new DNAStrand("TAGGCCTAAT");
	public static void main(String[] args){
		summarise(agtc);
	}
}

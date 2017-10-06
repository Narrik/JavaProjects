package w6;

public class DNAStrand {
	private String dna;
	public DNAStrand(String dna){
		this.dna = dna;
	}
	public boolean isValidDNA(){
	if (dna.matches("[A|T|C|G]+"))
		return true; 
	else return false;
	}
	public String complementWC(){
		String and="";
		for (int i = 0;i<=dna.length()-1;i++){
			if (dna.charAt(i) == 'A') and+='T';
			if (dna.charAt(i) == 'T') and+='A';
			if (dna.charAt(i) == 'C') and+='G';
			if (dna.charAt(i) == 'G') and+='C';
		}
		return and;
	}
	
	public String palindromeWC(){
		char[] pal = complementWC().toCharArray();;
	    int begin=0;
	    int end=pal.length-1;
	    char temp;
	    while(end>begin){
	        temp = pal[begin];
	        pal[begin]=pal[end];
	        pal[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(pal);
	}
	
	public boolean containsSequence(String seq){
	return dna.contains(seq);	
	}
	public String toString(){
		return dna;
	}
	

}

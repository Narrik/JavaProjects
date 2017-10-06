package w5;

public class OneTimePadEncipher {
	

	public static int charToInt(char l) {
		int k = 0;
		if (l ==' ') return 27;
		char chara = 'A';
	 for(int i = 0;i<26;i++){
		 if (l==chara){
			 k=i;
			 break;
		 }
		 chara++;
	 }
	 chara = 'a';
	 for(int i = 0;i<26;i++){
		 if (l==chara){
			 k=i;
			 break;
		 }
		 chara++;
	 }
		 return k;
	 }

	    public static char intToChar(int i) {
	    	char charista = 'a';
	    	char outputchar = 'a';
	    	 for(int j = 0;j<26;j++){
	    		 if (i==j){
	    			 outputchar = charista;
	    		 }
	    			 else {
	    				 charista++;
	    			 }
	    	 }
	    	 return outputchar;
	    	 }
	    	

	   // public static boolean isAlpha(char c) {
	      // You do not need to implement this method, but you may find it useful.
	    //}

	    public static String encipher(String original, String onetimepad) {
	    	String ciphered = "";
	     for (int i=0;i<original.length();i++){
	    	 int x = charToInt(original.charAt(i));
	    	 int y = charToInt(onetimepad.charAt(i));
	    	 if (x==27) ciphered = ciphered + ' ';
	    	 else{
	    	 int z = x+y;
	    	 char c = intToChar(z % 26);
	    	 ciphered = ciphered + c;
	    	 }
	     }
	     return ciphered;
	    }


	    public static void main(String[] args) {
	      String ciphertext = encipher("IS THIS SECURE", "KEEPMEVERYVERYSAFE");
	      System.out.print(ciphertext);
	    }

	}


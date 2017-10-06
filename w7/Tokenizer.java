package w7;


public class Tokenizer {

	private String[] tokenized = {};
	
	public Tokenizer(){
	}

	public Tokenizer(String fname) {
		tokensFromFile(fname);
	}

	// Class constructor. This calls tokensFromFile() on the constructor’s
	// argument.
	public void tokensFromFile(String fname) {
		In in = new In(fname);
		tokenize(in.readAll());
	}

	// Uses the In library from stdlib.zip to read the contents of the file
	// fname into a string via a call to Ins readAll() method. The method
	// tokenize() is then called on this string.
	public void tokenize(String str) {
		tokenized = str.split("\\W+");
	}

	// Create an array of tokens of type String[].
	public String[] getTokens() {
		return (tokenized);
	}

	// Return the tokens
	public int getNumberTokens() {
		return getTokens().length;
	}
	// Return the number of tokens.
}

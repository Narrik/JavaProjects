package w6;


public class Dalek2 {
	private String[] sayings;
	int random;
	public void setSayings(String[] say){
		sayings = say;
	}
	private String[] defaultsay = new String[]{"No utterances installed!"};
	public void speak(){
		if (sayings == null){
			setSayings(defaultsay);
		}
		random = (int) (Math.random()*(sayings.length));
		System.out.println(sayings[random]);
	}
	public static void main(String[] args) {
	    Dalek2 d1 = new Dalek2();
	    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek2 d2 = new Dalek2();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}
}
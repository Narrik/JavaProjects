package w7;

import java.util.ArrayList;

public class Dalek3 {

	private ArrayList<String> sayings = new ArrayList<String>();
	private String[] defaultsay = new String[] { "No utterances installed!" };

	public void setSayings(String[] say) {
		for (int i = 0; i <= say.length-1; i++) {
			sayings.add(say[i]);
		}
	}

	public void addSaying(String s) {
		sayings.add(s);
	}

	public void speak() {
		if (sayings.isEmpty()) {
			setSayings(defaultsay);
		}
		int random = (int) (Math.random() * (sayings.size()));
		System.out.println(sayings.get(random));
	}

	public static void main(String[] args) {
		Dalek3 d1 = new Dalek3();
		d1.addSaying("Exterminate, Exterminate!");
		d1.addSaying("I obey!");
		d1.addSaying("Exterminate, annihilate, DESTROY!");
		d1.addSaying("You cannot escape.");
		d1.addSaying("Daleks do not feel fear.");
		d1.addSaying("The Daleks must survive!");

		System.out.println("\nDalek d1 says: ");
		for (int i = 0; i < 10; i++) {
			d1.speak();
		}

		System.out.println("\nDalek d2 says: ");
		Dalek3 d2 = new Dalek3();
		d2.addSaying("I obey!");

		for (int i = 0; i < 10; i++) {
			d2.speak();
		}

	}
}

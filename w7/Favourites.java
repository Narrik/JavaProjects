package w7;

import w7.MusicTrack;
import java.util.ArrayList;
public class Favourites {
	private ArrayList<MusicTrack> favorites = new ArrayList<MusicTrack>();

public void addTrack(String artist, String title){
	favorites.add(new MusicTrack(artist,title));
}
	
public void showFavourites(){
	for (int i =0;i<favorites.size();i++){
			System.out.println(favorites.get(i));	
		}
}
public static void main (String[] args){
	Favourites favourites = new Favourites();
	favourites.addTrack("Fun", "Some Nights");
	favourites.addTrack("Oliver Tank", "Help You Breathe");
	favourites.addTrack("Horse Feathers", "Fit Against the Country");
	favourites.addTrack("Emile Sande", "Country House");
	favourites.addTrack("Fun", "Walking the Dog");
	favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
	favourites.showFavourites();
}

	
}

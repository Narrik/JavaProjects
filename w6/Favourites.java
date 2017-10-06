package w6;

import w6.MusicTrack;
public class Favourites {
	private MusicTrack[] favorites;
public Favourites (){
	favorites=new MusicTrack[5];
}
public void addTrack(String artist, String title){
	for (int i = 0;i<5;i++){
		if (favorites[i]!=null && favorites[4]!=null ){
			System.out.println("Sorry, can't add: "+title+" | "+artist+'\n');
			break;
		}
		else if (favorites [i]==null){
			favorites[i] = new MusicTrack(artist,title);
			break;
		}
		}
		}
	
public void showFavourites(){

		for (int i =0;i<5;i++){
			if (favorites[i]!=null){
			System.out.println(favorites[i].toString());	
		}
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

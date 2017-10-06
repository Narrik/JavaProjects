package w7;

public class MusicTrack {
		private String artistm;
		private String titlem;
	public MusicTrack (String artist,String title){
		artistm=artist;
		titlem=title;
	}
		public String getArtist(){
		return artistm;
		}
		public String getTitle(){
			return titlem;
		}
		
		public String toString(){
			return (titlem+" | "+artistm);
		}


}

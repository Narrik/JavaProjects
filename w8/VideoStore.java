package w8;

import java.util.ArrayList;

public class VideoStore {

	private ArrayList<Video> v1 = new ArrayList<Video>();

	public boolean addVideo(String title) {
		for (int i = 0;i<v1.size();i++){
			if (v1.get(i).getTitle() == title){
			System.out.println(title + " is already in stock.");
			return false;
		}
		}
			v1.add(new Video(title));
			return true;
	}

	// Add a video by title to the inventory. If there is already a video with
	// that title in the store’s inventory, print out an error message and
	// return false. Otherwise, add a new video with that title and return true.
	public Video getVideo(String title) {
		for (int i = 0;i<v1.size();i++){
			if (v1.get(i).getTitle() == title){
			return v1.get(i);
			}
		}
			System.out.println("Sorry, cannot find the requested video in the catalogue");
			return null;
	}


	// Return the video whose title is title. If there is no video in the
	// inventory with that title, print out an error message and return null.
	public boolean checkOutVideo(String title) {
		for (int i = 0;i<v1.size();i++){
			if (v1.get(i).getTitle() == title){
					return v1.get(i).checkOut();
			}
		}
			System.out.println("Sorry, cannot find the requested video in the catalogue");
			return false;	
	}

	// Check out a video by title. If there is a video with that title not
	// already checked out, change its status to checked out and return true.
	// Otherwise, print out an appropriate error message and return false.
	public boolean returnVideo(Video video) {
	if (v1.contains(video)) {	
		return video.returnToStore();
	} else {
		System.out.println("Sorry, this video did not come from this store");
		return false;
	}
	}

	// Return the result of calling the returnToStore() method on the video.
	public void rateVideo(Video video, int rating) {
		video.addRating(rating);
	}

	// Add the rating rating to the video.
	public double getAverageRatingForVideo(Video video) {
		return video.getAverageRating();
	}

	// Return the average user rating for this video as a double.
	public Video[] getCheckedOut() {
		int j = 0;
		for (int i = 0;i<v1.size();i++){
			if (v1.get(i).isCheckedOut())
				j++;
		}
			Video[] checkedVideos = new Video[j];
			j = 0;
			for (int i = 0;i<v1.size();i++){
				if (v1.get(i).isCheckedOut()){
					checkedVideos[j] = v1.get(i);
					j++;
			}
		}
		return checkedVideos;
	}

	// Return an array of type Video[] consisting of all videos in the store
	// which have been checked out.
	public Video mostPopular() {
		double rating = -1;
		Video video = new Video("lul");
		if (v1.isEmpty()){
			return null;
		} else {
			for (int i = 0;i<v1.size();i++){			
				if (v1.get(i).getAverageRating() > rating){
					rating = v1.get(i).getAverageRating();
					video =v1.get(i);
				}
			}
			return video;
	}
	}
	}
	// Return the video which has the highest average ranking. If there is a
	// tie, return the first one. If the store is not stocking any videos,
	// return null;

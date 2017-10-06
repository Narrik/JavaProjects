package w8;

public class Video {

	private String title;
	private double rating = 0;
	private double ratingamount = 0;
	private boolean checkedout = false;

	public Video(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public boolean addRating(int rating) {
		if (rating <= 5 && rating >= 1) {
			this.rating += rating;
			ratingamount += 1;
			return true;
		} else {
			System.out.println(rating+" should be between 1 and 5.");
			return false;
		}
	}

	public double getAverageRating() {
		if (rating == 0)
			return 0.0;
		else
			return rating / ratingamount;
	}

	public boolean checkOut() {
		if (checkedout == true) {
			System.out.println(toString() + " is already checked out.");
			return false;
		} else {
			checkedout = true;
			return true;
		}
	}

	public boolean returnToStore() {
		if (checkedout == true) {
			checkedout = false;
			return true;
		} else {
			System.out.println(toString() + " is not checked out.");
			return false;
		}
	}

	public boolean isCheckedOut() {
		return checkedout;
	}

	public String toString() {
		return "Video[title=\"" + title + "\", checkedOut=" + checkedout + "]";
	}

}

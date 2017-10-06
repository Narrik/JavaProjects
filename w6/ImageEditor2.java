package w6;

import java.awt.Color;

public class ImageEditor2 {
	public static Picture threshold(Picture pic, int thresh) {
		Picture grayp = new Picture(pic.width(), pic.height());
		for (int i = 0; i <= pic.width() - 1; i++) {
			for (int j = 0; j <= pic.height() - 1; j++) {
				 if (ImageEditor1.luminance(pic.get(i, j))<thresh){
					 grayp.set(i, j, Color.BLACK);	 
				 }
				 else
					 grayp.set(i, j, ImageEditor1.toGrey(pic.get(i, j)));
			}
		}
		return grayp;
	}
	public static void main(String[] args){
		Picture p = new Picture("Master.png"); // or use any other colour image
		Picture greyscale =threshold(p,70);
		greyscale.show();
	}
}

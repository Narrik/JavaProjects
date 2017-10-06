package w6;

import java.awt.*;

public class ImageEditor1 {

	public static double luminance(Color color) {
		return (0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue());
	}

	public static Color toGrey(Color color) {
		return new Color((int) Math.round(luminance(color)),(int) Math.round(luminance(color)),(int) Math.round(luminance(color)));
	}

	public static Picture makeGreyscale(Picture pic) {
		Picture grayp = new Picture(pic.width(), pic.height());
		for (int i = 0; i <= pic.width() - 1; i++) {
			for (int j = 0; j <= pic.height() - 1; j++) {
				grayp.set(i, j, toGrey(pic.get(i, j)));
			}
		}
		return grayp;
	}

	public static void main(String[] args) {
		Picture p = new Picture("Master.png"); // or use any other colour image
		Picture greyscale = makeGreyscale(p);
		greyscale.show();
	}
}

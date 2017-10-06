package programmingclub;

import java.awt.*;

public class SimpleImage {
	
	public static Picture createRedPic(int width, int height) {
		Picture pic1 = new Picture(width,height);
		for (int i=0; i<pic1.width()-1;i++){
			for (int j=0; j<pic1.height()-1;j++){
				pic1.set(i, j, Color.red);
			}
		}
		return pic1;
	}
	public static Picture createBRBMPic(int width, int height) {
		Picture pic1 = new Picture(width,height);
		for (int i=0; i<pic1.width()-1;i++){
			for (int j=0; j<pic1.height()-1;j++){
				pic1.set(i, j,new Color(i,0,j));
			}
		}
		return pic1;
	}
	
	public static Picture createMandelBrot(int width, int height) {
		Picture pic1 = new Picture(width,height);
		for (int i=0; i<pic1.width()-1;i++){
			for (int j=0; j<pic1.height()-1;j++){
				pic1.set(i, j,new Color(i,0,j));
			}
		}
		return pic1;
	}
	
	
	
	public static void main(String[] args){
		Picture pic1 = createRedPic(200,100);
		pic1.show();
		Picture pic2 = createBRBMPic (200,100);
		pic2.show();
	}
}



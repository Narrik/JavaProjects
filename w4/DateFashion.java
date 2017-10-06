package w4;

public class DateFashion {
	public static int dateFashion(int you, int date){
		if (you<3 || date<3)
			return 0;
		else if (you>7 || date>7)
			return 2;
		else return 1;
	}
	public static void main (String[] args){
		System.out.println(dateFashion(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}

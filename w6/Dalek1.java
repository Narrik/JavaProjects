package w6;

public class Dalek1 {
	public int i;

    private double batteryCharge = 5.0; // instance variable

    public void batteryReCharge(double c) {
       batteryCharge += c;
       System.out.println("Battery charge is: "+batteryCharge);
    }

    public void move(int distance) {
    	i=1;
   
    for (int  j=1;j<=distance;j++) if (batteryCharge >=0.5){
    	batteryCharge -= 0.5;
    	System.out.print("["+i+"] ");
    	i++;
    }
    else System.out.println("Out of power!");
    }

    public static void main(String[] args) {
        Dalek1 d = new Dalek1(); // start off with a well-charged battery
        d.move(11);              // move around and use up the charge
        d.batteryReCharge(2.5);  // get a new charge
        d.batteryReCharge(0.5);  // add a bit more
        d.move(5);               // move some more
    }
}

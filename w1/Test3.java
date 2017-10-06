package w1;

import java.util.Date;

public class Test3 extends Test2
{
      private int shift;
      private double hourlyrate;
      public Test3(String name, String number, Date date, int shift, double hourlyrate){
    	  super(name,number,date);
    	  super.setName(name);
      }
      public static void main(String[] args){
    	 double n = 461012.677476;
          System.out.format("%.1f", n); 
          System.out.println("lul");
}}
    
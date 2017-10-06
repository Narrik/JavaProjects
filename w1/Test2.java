package w1;

import java.util.Date;

public class Test2
{
      private String name, number;
      private Date date;
     
      
      public Test2(String name, String number, Date date)
      {
    	 this.name = name;
    	 this.number = number;
    	 this.date = date;
      }
      public String getName(Test2 test2){
    	  return name;
      }
      public void setName (String name){
    	  this.name = name;
      }
}

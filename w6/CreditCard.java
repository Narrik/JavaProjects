package w6;
import java.util.Calendar;

public class CreditCard {
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber){
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	Calendar now = Calendar.getInstance();
	public String formatExpiryDate(){
		return (expiryMonth+"/"+(expiryYear % 100));
	}
	public String formatFullName(){
		return (firstName+" "+lastName);
	}
	public String formatCCNumber(){
		return (ccNumber.substring(0,4)+" "+ccNumber.substring(4,8)+" "+ccNumber.substring(8,12)+" "+ccNumber.substring(12,16));
	}
	public boolean isValid(){
		if (now.get(Calendar.YEAR)==expiryYear && (now.get(Calendar.MONTH))+1>=expiryMonth){
			return false;
		}
		else if (now.get(Calendar.YEAR)<=expiryYear) {
		return true;
		}
		else return false;
	}
	public String toString(){
		return ("Number: "+formatCCNumber()+'\n'+"Expiration date: "+formatExpiryDate()+'\n'+"Account holder: "+formatFullName()+'\n'+"Is valid: "+isValid());	
}
}

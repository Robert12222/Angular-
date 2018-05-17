package App;
import java.util.HashMap;

public class Account {

	private String FirstName;
	private String SecondName;
	private int AccountNumber;
	
	public Account(String cFirstName, String cSecondName, int cAccountNumber) {
		this.setFirstName(cFirstName);
		this.setAccountNumber(cAccountNumber);
		this.setSecondName(cSecondName);
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public void setSecondName(String secondName) {
		this.SecondName = secondName;
	}
	public String getSecondName() {
		return SecondName;
	}
	
	public int getAccountNumber(int AccountNumber) {
		return AccountNumber;
	}
	
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
}

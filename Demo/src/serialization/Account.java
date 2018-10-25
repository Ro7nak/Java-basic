package serialization;

import java.io.Serializable;

public class Account implements Serializable{
	private String accountName;
	private transient String accountNo;
	public String bankName  ;
	
	public Account(String accountName, String accountNo) {
		this.accountName = accountName;
		this.accountNo = accountNo;
		bankName = "BankIndia" ;
	}
	
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNo=" + accountNo + 
				", bankName=" + bankName +"]";
	}
}
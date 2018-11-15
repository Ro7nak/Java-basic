package com.infosys.infybank.common;
/**  
* OtpType.java - enum to represent the type of OTP 
* @author  ETA Java
* @version 1.0 
* */
public enum TransactionType {
	CREDIT("CA"),DEBIT("D");
	private final String type;
	
	private TransactionType(String type){
		this.type=type;
	}
	public String toString(){
		return this.type;
	}
	
}

package com.infosys.infybank.core.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class RegistrationDTO.
 */
@XmlRootElement

public class RegistrationDTO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The first name. */
	private String firstName;
	
	/** The last name. */
	
	private String lastName;
	
	/** The email id. */

	private String emailId;

	/** The aadhar id. */

	private String aadharId;

	/** The acct type. */
	private String acctType;
	
	/** The balance. */
	private BigDecimal balance;

	/** The address. */

	private String address;

	/** The city. */
	private String city;

	/** The state. */

	private String state;

	/** The pincode. */

	private String pincode;

	/** The salaried. */

	private String salaried;

	/** The dob. */

	private Date dob;

	/** The pan no. */

	private String panNo;

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the email id.
	 *
	 * @return the email id
	 */
	public String getEmailId() {
		return emailId;
	}
	
	/**
	 * Sets the email id.
	 *
	 * @param emailId the new email id
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	/**
	 * Gets the aadhar id.
	 *
	 * @return the aadhar id
	 */
	public String getAadharId() {
		return aadharId;
	}
	
	/**
	 * Sets the aadhar id.
	 *
	 * @param aadharId the new aadhar id
	 */
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	
	/**
	 * Gets the acct type.
	 *
	 * @return the acct type
	 */
	public String getAcctType() {
		return acctType;
	}
	
	/**
	 * Sets the acct type.
	 *
	 * @param acctType the new acct type
	 */
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}
	
	/**
	 * Sets the balance.
	 *
	 * @param balance the new balance
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Gets the pincode.
	 *
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	
	/**
	 * Sets the pincode.
	 *
	 * @param pincode the new pincode
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	/**
	 * Gets the salaried.
	 *
	 * @return the salaried
	 */
	public String getSalaried() {
		return salaried;
	}
	
	/**
	 * Sets the salaried.
	 *
	 * @param salaried the new salaried
	 */
	public void setSalaried(String salaried) {
		this.salaried = salaried;
	}
	
	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	
	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	/**
	 * Gets the pan no.
	 *
	 * @return the pan no
	 */
	public String getPanNo() {
		return panNo;
	}
	
	/**
	 * Sets the pan no.
	 *
	 * @param panNo the new pan no
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegistrationDTO [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", aadharId=" + aadharId + ", acctType=" + acctType + ", balance=" + balance + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", salaried=" + salaried + ", dob="
				+ dob + ", panNo=" + panNo  + "]";
	}
	
	
	
}

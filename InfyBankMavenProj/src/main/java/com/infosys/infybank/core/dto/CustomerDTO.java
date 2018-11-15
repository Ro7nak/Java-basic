package com.infosys.infybank.core.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * The Class CustomerDTO.
 */

public class CustomerDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The cust id. */
	private int custId;

	/** The aadhar id. */
	private String aadharId;

	/** The pan no. */
	private String panNo;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The email id. */
	private String emailId;

	/** The address. */
	private String address;

	/** The city. */
	private String city;

	/** The state. */
	private String state;

	/** The pincode. */
	private String pincode;

	/** The dob. */
	private Date dob;

	/** The amount pref. */
	private String amountPref;

	/** The date pref. */
	private String datePref;

	/** The cr db notif limit. */
	private BigDecimal crDbNotifLimit;

	/** The lst updt ts. */
	private LocalDateTime lstUpdtTs;

	/** The lst updt id. */
	private String lstUpdtId;

	/**
	 * Instantiates a new customer DTO.
	 */
	public CustomerDTO() {
	}

	/**
	 * Gets the cust id.
	 *
	 * @return the cust id
	 */
	public int getCustId() {
		return this.custId;
	}

	/**
	 * Sets the cust id.
	 *
	 * @param custId
	 *            the new cust id
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}

	/**
	 * Gets the aadhar id.
	 *
	 * @return the aadhar id
	 */
	public String getAadharId() {
		return this.aadharId;
	}

	/**
	 * Sets the aadhar id.
	 *
	 * @param aadharId
	 *            the new aadhar id
	 */
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	/**
	 * Gets the pan no.
	 *
	 * @return the pan no
	 */
	public String getPanNo() {
		return this.panNo;
	}

	/**
	 * Sets the pan no.
	 *
	 * @param panNo
	 *            the new pan no
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the fisrt name.
	 *
	 * @param firstName
	 *            the new fisrt name
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
		return this.lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
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
		return this.emailId;
	}

	/**
	 * Sets the email id.
	 *
	 * @param emailId
	 *            the new email id
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the new address
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
		return this.city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the new city
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
		return this.state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state
	 *            the new state
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
		return this.pincode;
	}

	/**
	 * Sets the pincode.
	 *
	 * @param pincode
	 *            the new pincode
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return this.dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob
	 *            the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Gets the amount pref.
	 *
	 * @return the amount pref
	 */
	public String getAmountPref() {
		return this.amountPref;
	}

	/**
	 * Sets the amount pref.
	 *
	 * @param amountPref
	 *            the new amount pref
	 */
	public void setAmountPref(String amountPref) {
		this.amountPref = amountPref;
	}

	/**
	 * Gets the date pref.
	 *
	 * @return the date pref
	 */
	public String getDatePref() {
		return this.datePref;
	}

	/**
	 * Sets the date pref.
	 *
	 * @param datePref
	 *            the new date pref
	 */
	public void setDatePref(String datePref) {
		this.datePref = datePref;
	}

	/**
	 * Gets the cr db notif limit.
	 *
	 * @return the cr db notif limit
	 */
	public BigDecimal getCrDbNotifLimit() {
		return this.crDbNotifLimit;
	}

	/**
	 * Sets the cr db notif limit.
	 *
	 * @param crDbNotifLimit
	 *            the new cr db notif limit
	 */
	public void setCrDbNotifLimit(BigDecimal crDbNotifLimit) {
		this.crDbNotifLimit = crDbNotifLimit;
	}

	/**
	 * Gets the lst updt ts.
	 *
	 * @return the lst updt ts
	 */
	public LocalDateTime getLstUpdtTs() {
		return this.lstUpdtTs;
	}

	/**
	 * Sets the lst updt ts.
	 *
	 * @param lstUpdtTs
	 *            the new lst updt ts
	 */
	public void setLstUpdtTs(LocalDateTime lstUpdtTs) {
		this.lstUpdtTs = lstUpdtTs;
	}

	/**
	 * Gets the lst updt id.
	 *
	 * @return the lst updt id
	 */
	public String getLstUpdtId() {
		return this.lstUpdtId;
	}

	/**
	 * Sets the lst updt id.
	 *
	 * @param lstUpdtId
	 *            the new lst updt id
	 */
	public void setLstUpdtId(String lstUpdtId) {
		this.lstUpdtId = lstUpdtId;
	}

	/**
	 * Prepare DTO.
	 *
	 * @param customerEntity
	 *            the customer entity
	 * @return the customer DTO
	 */

	/**
	 * Prepare customer entity.
	 *
	 * @param registerDTO
	 *            the register DTO
	 * @return the customer
	 */
	public static CustomerDTO prepareCustomerDTO(RegistrationDTO registerDTO) {

		CustomerDTO dto = new CustomerDTO();
		dto.setFirstName(registerDTO.getFirstName());
		dto.setLastName(registerDTO.getLastName());
		dto.setAadharId(registerDTO.getAadharId());
		dto.setEmailId(registerDTO.getEmailId());
		dto.setAddress(registerDTO.getAddress());
		dto.setCity(registerDTO.getCity());
		dto.setState(registerDTO.getState());
		dto.setPincode(registerDTO.getPincode());
		dto.setPanNo(registerDTO.getPanNo());
		dto.setDob(registerDTO.getDob());
		dto.setLstUpdtTs(LocalDateTime.now());
		return dto;
	}

	@Override
	public String toString() {
		return "CustomerDTO [custId=" + custId + ", aadharId=" + aadharId + ", panNo=" + panNo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", address=" + address + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + ", dob=" + dob + ", amountPref=" + amountPref
				+ ", datePref=" + datePref + ", crDbNotifLimit=" + crDbNotifLimit + ", lstUpdtTs=" + lstUpdtTs
				+ ", lstUpdtId=" + lstUpdtId + "]";
	}

}

package com.infosys.infybank.core.dto;

import java.time.LocalDateTime;


/**
 * The Class LoginDTO.
 */



public class LoginDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** The cust id. */

	private int custId;


	private String userId;

	
	private String password;

	
	private char role;

	/** The lst updt ts. */
	
	private LocalDateTime lstUpdtTs;

	
	private String lstUpdtId;

	/**
	 * Instantiates a new login.
	 */
	public LoginDTO() {
		lstUpdtTs= LocalDateTime.now();
	}

	/**
	 * Instantiates a new login.
	 *
	 * @param custId the cust id
	 * @param userId the user id
	 * @param password the password
	 * @param role the role
	 * @param lstUpdtId the lst updt id
	 */
	public LoginDTO(int custId, String userId, String password, char role,String lstUpdtId) {
		super();
		this.custId = custId;
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.lstUpdtId=lstUpdtId;
	}

	/**
	 * Instantiates a new login.
	 *
	 * @param custId the cust id
	 * @param userId the user id
	 * @param password the password
	 * @param role the role
	 * @param lstUpdtTs the lst updt ts
	 * @param lstUpdtId the lst updt id
	 */
	public LoginDTO(int custId, String userId, String password, char role, LocalDateTime lstUpdtTs, String lstUpdtId) {
		this.custId = custId;
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.lstUpdtTs = lstUpdtTs;
		this.lstUpdtId = lstUpdtId;
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
	 * @param custId the new cust id
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public char getRole() {
		return this.role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(char role) {
		this.role = role;
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
	 * @param lstUpdtTs the new lst updt ts
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
	 * @param lstUpdtId the new lst updt id
	 */
	public void setLstUpdtId(String lstUpdtId) {
		this.lstUpdtId = lstUpdtId;
	}

	@Override
	public String toString() {
		return "Login [custId=" + custId + ", userId=" + userId + ", password=" + password + ", role=" + role
				+ ", lstUpdtTs=" + lstUpdtTs + ", lstUpdtId=" + lstUpdtId + "]";
	}

}

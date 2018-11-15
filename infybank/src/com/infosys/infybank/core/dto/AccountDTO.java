package com.infosys.infybank.core.dto;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * The Class AccountDTO.
 */
public class AccountDTO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String acctNo;
	private int custId;
	private String acctType;
	private BigDecimal balance;
	private String salaried;
	private LocalDateTime lstUpdtTs;
	private String lstUpdtId;
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/** The user id. */
	private String userId;
	
	/**
	 * Gets the acct no.
	 *
	 * @return the acct no
	 */
	public String getAcctNo() {
		return acctNo;
	}
	
	/**
	 * Sets the acct no.
	 *
	 * @param acctNo the new acct no
	 */
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	
	/**
	 * Gets the cust id.
	 *
	 * @return the cust id
	 */
	public int getCustId() {
		return custId;
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
	 * Gets the lst updt ts.
	 *
	 * @return the lst updt ts
	 */
	public LocalDateTime getLstUpdtTs() {
		return lstUpdtTs;
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
		return lstUpdtId;
	}
	
	/**
	 * Sets the lst updt id.
	 *
	 * @param lstUpdtId the new lst updt id
	 */
	public void setLstUpdtId(String lstUpdtId) {
		this.lstUpdtId = lstUpdtId;
	}
	
	/**
	 * Instantiates a new account DTO.
	 */
	public AccountDTO() {
		super();
		this.lstUpdtTs = LocalDateTime.now();
	}
	
	/**
	 * Instantiates a new account DTO.
	 *
	 * @param acctType the acct type
	 * @param balance the balance
	 * @param salaried the salaried
	 * @param custId the cust id
	 * @param userId the user id
	 */
	public AccountDTO(String acctType, BigDecimal balance, String salaried,int custId,String userId) {
		super();
		this.acctType = acctType;
		this.balance = balance;
		this.salaried = salaried;
		this.custId=custId;
		this.userId=userId;
		this.lstUpdtId=userId;
		this.lstUpdtTs = LocalDateTime.now();
		
	}
	


	@Override
	public String toString() {
		return "AccountDTO [acctNo=" + acctNo + ", custId=" + custId + ", acctType=" + acctType + ", balance=" + balance
				+ ", salaried=" + salaried + ", lstUpdtTs=" + lstUpdtTs + ", lstUpdtId=" + lstUpdtId + "]";
	}
	
	
}

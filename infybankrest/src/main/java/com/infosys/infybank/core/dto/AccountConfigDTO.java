package com.infosys.infybank.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


/**
 * The Class AccountConfigViewDTO.
 */
public class AccountConfigDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The acct type. */
	@NotNull(message = "accountconfig.acctType.mandatory")
	private char acctType;

	/** The interest rate. */
	@NotNull(message = "accountconfig.interest.mandatory")
	@Digits(integer = 8, fraction = 4, message = "accountconfig.interest.size")
	private BigDecimal interestRate;

	/** The min balance. */
	@NotNull(message = "accountconfig.minimumBalance.mandatory")
	@Digits(integer = 8, fraction = 4, message = "accountconfig.minimumBalance.size")
	private BigDecimal minBalance;

	/**
	 * gets the account type.
	 *
	 * @return the acct type
	 */
	public char getAcctType() {
		return acctType;
	}

	/**
	 * sets the account type.
	 *
	 * @param acctType the new acct type
	 */
	public void setAcctType(char acctType) {
		this.acctType = acctType;
	}

	/**
	 * gets the interest rate.
	 *
	 * @return the interest rate
	 */

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	/**
	 * sets the interest rate.
	 *
	 * @param interestRate the new interest rate
	 */
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * gets the minimum balance.
	 *
	 * @return the min balance
	 */
	public BigDecimal getMinBalance() {
		return minBalance;
	}

	/**
	 * sets the minimum balance.
	 *
	 * @param minBalance the new min balance
	 */
	public void setMinBalance(BigDecimal minBalance) {
		this.minBalance = minBalance;
	}

	
	
	/**
	 * toString Method.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "AccountConfigDTO [acctType=" + acctType + ", interestRate=" + interestRate + ", minBalance="
				+ minBalance + "]";
	}

}

/**
 * 
 */
package com.infosys.infybank.common;


/**
 * The Enum TransactionCategory.
 */
public enum TransactionCategory {

	/**
	 * The salary deposit.
	 */
	SALARY_DEPOSIT("S"),

	/**
	 * The interest credit.
	 */
	INTEREST_CREDIT("I"),

	/**
	 * The funds transfer.
	 */
	FUNDS_TRANSFER("F"),

	/**
	 * The cash balance.
	 */
	CASH_BALANCE("C"),

	/**
	 * The loan payment.
	 */
	LOAN_PAYMENT("N"),

	/**
	 * The fd maturity.
	 */
	FD_MATURITY("M"),

	/**
	 * The fd deposit.
	 */
	FD_DEPOSIT("D");

	/**
	 * The category.
	 */
	private final String category;

	/**
	 * Instantiates a new transaction category.
	 *
	 * @param category
	 *            the category
	 */
	private TransactionCategory(String category) {
		this.category = category;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return category;
	}

}

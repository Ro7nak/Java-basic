/**
 * 
 */
package com.infosys.infybank.common;

/**
 * @author Vidya_Lakshman01
 *
 */
public enum TransactionCategory {
	SALARY_DEPOSIT("S"), INTEREST_CREDIT("I"), FUNDS_TRANSFER("F"), CASH_BALANCE("C"),
		LOAN_PAYMENT("N"), FD_MATURITY("M"), FD_DEPOSIT("D");
	private final String category;

	private TransactionCategory(String category) {
		this.category = category;
	}

	public String toString() {
		return category;
	}

}

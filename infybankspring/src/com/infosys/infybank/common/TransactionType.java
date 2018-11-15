package com.infosys.infybank.common;

/**
 * The Enum TransactionType.
 */
public enum TransactionType {

	/**
	 * The credit.
	 */
	CREDIT("CA"),
	/**
	 * The debit.
	 */
	DEBIT("D");

	/**
	 * The type.
	 */
	private final String type;

	/**
	 * Instantiates a new transaction type.
	 *
	 * @param type
	 *            the type
	 */
	private TransactionType(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return this.type;
	}

}

package com.infosys.infybank.core.service;

import java.math.BigDecimal;

import com.infosys.infybank.core.repository.AccountConfigRepository;

/**
 * Account Config Service class for account opening check
 * 
 * @author ETA Java
 * @version 1.0
 */
public class AccountConfigService {

	private AccountConfigRepository accountConfigRepository = new AccountConfigRepository();

	/**
	 * Check the min balance for account type
	 *
	 * @param accType
	 *            the acc type C or S
	 * @return the long
	 */
	
	public BigDecimal getMinimumBalance(String accType) {
		return accountConfigRepository.findMinimumBalance(accType);
	}
}

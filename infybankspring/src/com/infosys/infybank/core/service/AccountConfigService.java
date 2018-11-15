package com.infosys.infybank.core.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infybank.core.repository.AccountConfigRepository;

/**
 * The Class AccountConfigService.
 */
@Service
public class AccountConfigService {

	/** The account config repository. */
	@Autowired
	private AccountConfigRepository accountConfigRepository;

	/**
	 * Gets the minimum balance.
	 *
	 * @param accType
	 *            the acc type
	 * @return the minimum balance
	 */
	public BigDecimal getMinimumBalance(String accType) {
		return accountConfigRepository.findMinimumBalance(accType);
	}
}

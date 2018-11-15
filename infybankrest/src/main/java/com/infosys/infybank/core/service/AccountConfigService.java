package com.infosys.infybank.core.service;

import java.math.BigDecimal;
import java.util.List;

import com.infosys.infybank.core.dto.AccountConfigDTO;
import com.infosys.infybank.core.repository.AccountConfigRepository;

/**
 * Account Config Service class for account opening check
 * 
 * @author ETA Java
 * @version 1.0
 */
public class AccountConfigService {

	private AccountConfigRepository accountConfigRepository = new AccountConfigRepository();

	public BigDecimal getMinimumBalance(String accType) {
		return accountConfigRepository.findMinimumBalance(accType);
	}
	
	public List<AccountConfigDTO> getAccountConfigs() {
		return accountConfigRepository.getAccountConfigs();
	}
}

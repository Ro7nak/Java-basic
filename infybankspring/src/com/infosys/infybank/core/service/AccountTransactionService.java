
package com.infosys.infybank.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infybank.core.dto.AccountTransactionDTO;
import com.infosys.infybank.core.repository.AccountTransactionRepository;

/**
 * The Class AccountTransactionService.
 */
@Service
public class AccountTransactionService {

	/** The account transaction repository. */
	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	/**
	 * Perform transaction.
	 *
	 * @param dto
	 *            the dto
	 * @return the int
	 */
	public int performTransaction(AccountTransactionDTO dto) {
		return accountTransactionRepository.save(dto);

	}

}

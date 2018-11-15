
package com.infosys.infybank.core.service;

import com.infosys.infybank.core.dto.AccountTransactionDTO;
import com.infosys.infybank.core.repository.AccountTransactionRepository;

/**
 * AccountTransactionService class for account transaction
 * 
 * @author ETA Java
 * @version 1.0
 */
public class AccountTransactionService {

	/** The transaction repository. */
	private AccountTransactionRepository accountTransactionRepository = new AccountTransactionRepository();

	/**
	 * Perform transaction.
	 *
	 * @param dto
	 * 
	 * @return the int
	 */
	public int performTransaction(AccountTransactionDTO dto) {
		return accountTransactionRepository.save(dto);

	}

}

package com.infosys.infybank.core.service;

import java.math.BigDecimal;

import com.infosys.infybank.core.dto.AccountDTO;
import com.infosys.infybank.core.dto.AccountTransactionDTO;
import com.infosys.infybank.core.repository.AccountRepository;
import com.infosys.infybank.exception.InfyBankServiceException;

/**
 * Account Service class for account opening
 * 
 * @author ETA Java
 * @version 1.0
 */
public class AccountService {

	/** The account repository. */
	private AccountRepository accountRepository = new AccountRepository();

	/** The account config repository. */

	private AccountConfigService accountConfigService = new AccountConfigService();

	/** The transaction service. */

	private AccountTransactionService transactionService = new AccountTransactionService();

	private final String IFSC_CODE = "04102";
	private final String CURRENT_ACCOUNT = "C";
	private final String ACCT_TYPE_CURRENT = "01";
	private final String ACCT_TYPE_SAVINGS = "02";

	/**
	 * Generate account number.
	 *
	 * @param accType
	 *            the acc type
	 * @return the long
	 */
	public String generateAccountNumber(String accType) {

		int accountNo = 0;
		String accountType = ACCT_TYPE_SAVINGS;

		if (accType.equals(CURRENT_ACCOUNT))
			accountType = ACCT_TYPE_CURRENT;

		String acctNo = IFSC_CODE + accountType + accountNo;

		return acctNo;
	}

	/**
	 * Open account and credit amount.
	 *
	 * @param custId
	 *            the cust id
	 * @param amount
	 *            the amount
	 * @param accType
	 *            the acc type
	 * @param userId
	 *            the user id
	 * @param salaried
	 *            the salaried
	 * @return the int
	 * @throws InfyBankServiceException
	 *             the infy bank service exception
	 */
	public int openAccountAndCreditAmount(int custId, BigDecimal amount, String accType, String userId, String salaried)
			throws InfyBankServiceException {

		// insertion into Account table
		AccountDTO accDTO = new AccountDTO(accType, amount, salaried, custId, userId);
		String accId = generateAccountNumber(accType);
		accDTO.setAcctNo(accId);
		accountRepository.save(accDTO);

		// check if amount to be deposited is >= Min. Balance
		BigDecimal minBalance = accountConfigService.getMinimumBalance(accType);
		if (minBalance == null)
			throw new InfyBankServiceException("Account Config is null");

		if (amount.floatValue() >= minBalance.floatValue()) {
			// populate accountTransaction entity & perform transaction
			AccountTransactionDTO transaction = AccountTransactionDTO.prepareTransactionDTO(custId, accDTO.getAcctNo(),
					amount, accType, userId);
			return transactionService.performTransaction(transaction);
		} else {
			throw new InfyBankServiceException("Amount to be deposited must be more than min balance");
		}
	}

}

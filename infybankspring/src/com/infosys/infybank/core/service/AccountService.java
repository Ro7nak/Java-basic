package com.infosys.infybank.core.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infybank.core.dto.AccountDTO;
import com.infosys.infybank.core.dto.AccountTransactionDTO;
import com.infosys.infybank.core.repository.AccountRepository;
import com.infosys.infybank.exception.InfyBankServiceException;


/**
 * The Class AccountService.
 */
@Service
public class AccountService {

	/** The account repository. */
	@Autowired
	private AccountRepository accountRepository;

	/** The account config service. */
	@Autowired
	private AccountConfigService accountConfigService;

	/** The transaction service. */
	@Autowired
	private AccountTransactionService transactionService;

	/**
	 * Generate account number.
	 *
	 * @param accType
	 *            the acc type
	 * @return the string
	 */
	public String generateAccountNumber(String accType) {

		int accountNo = 0;
		String accountType = null;
		String ifscCode = "04102";

		if (accType.equals("C"))
			accountType = "01";
		else
			accountType = "02";
		String acctNo = ifscCode + accountType + accountNo;

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

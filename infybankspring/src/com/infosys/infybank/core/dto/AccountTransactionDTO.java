package com.infosys.infybank.core.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import com.infosys.infybank.common.TransactionCategory;
import com.infosys.infybank.common.TransactionType;


/**
 * The Class AccountTransactionDTO.
 */
@XmlRootElement
@Component
public class AccountTransactionDTO implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The txn id. */
	private int txnId;

	/** The cust id. */
	private int custId;

	/** The acct no. */
	private String acctNo;

	/** The txn date. */
	private LocalDate txnDate;

	/** The txn typ. */
	private char txnTyp;

	/** The txn amount. */
	private BigDecimal txnAmount;

	/** The opening bal. */
	private BigDecimal openingBal;

	/** The closing bal. */
	private BigDecimal closingBal;

	/** The txn category. */
	private char txnCategory;

	/** The remarks. */
	private String remarks;

	/** The ref id. */
	private String refId;

	/** The lst updt ts. */
	private LocalDateTime lstUpdtTs;

	/** The lst updt id. */
	private String lstUpdtId;

	/**
	 * Gets the txn id.
	 *
	 * @return the txn id
	 */
	public int getTxnId() {
		return txnId;
	}

	/**
	 * Sets the txn id.
	 *
	 * @param txnId the new txn id
	 */
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	/**
	 * Gets the cust id.
	 *
	 * @return the cust id
	 */
	public int getCustId() {
		return custId;
	}

	/**
	 * Sets the cust id.
	 *
	 * @param custId the new cust id
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}

	/**
	 * Gets the acct no.
	 *
	 * @return the acct no
	 */
	public String getAcctNo() {
		return acctNo;
	}

	/**
	 * Sets the acct no.
	 *
	 * @param acctNo the new acct no
	 */
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	/**
	 * Gets the txn date.
	 *
	 * @return the txn date
	 */
	public LocalDate getTxnDate() {
		return txnDate;
	}

	/**
	 * Sets the txn date.
	 *
	 * @param txnDate the new txn date
	 */
	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	/**
	 * Gets the txn typ.
	 *
	 * @return the txn typ
	 */
	public char getTxnTyp() {
		return txnTyp;
	}

	/**
	 * Sets the txn typ.
	 *
	 * @param txnTyp the new txn typ
	 */
	public void setTxnTyp(char txnTyp) {
		this.txnTyp = txnTyp;
	}

	/**
	 * Gets the txn amount.
	 *
	 * @return the txn amount
	 */
	public BigDecimal getTxnAmount() {
		return txnAmount;
	}

	/**
	 * Sets the txn amount.
	 *
	 * @param txnAmount the new txn amount
	 */
	public void setTxnAmount(BigDecimal txnAmount) {
		this.txnAmount = txnAmount;
	}

	/**
	 * Gets the opening bal.
	 *
	 * @return the opening bal
	 */
	public BigDecimal getOpeningBal() {
		return openingBal;
	}

	/**
	 * Sets the opening bal.
	 *
	 * @param openingBal the new opening bal
	 */
	public void setOpeningBal(BigDecimal openingBal) {
		this.openingBal = openingBal;
	}

	/**
	 * Gets the closing bal.
	 *
	 * @return the closing bal
	 */
	public BigDecimal getClosingBal() {
		return closingBal;
	}

	/**
	 * Sets the closing bal.
	 *
	 * @param closingBal the new closing bal
	 */
	public void setClosingBal(BigDecimal closingBal) {
		this.closingBal = closingBal;
	}

	/**
	 * Gets the txn category.
	 *
	 * @return the txn category
	 */
	public char getTxnCategory() {
		return txnCategory;
	}

	/**
	 * Sets the txn category.
	 *
	 * @param txnCategory the new txn category
	 */
	public void setTxnCategory(char txnCategory) {
		this.txnCategory = txnCategory;
	}

	/**
	 * Gets the remarks.
	 *
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * Sets the remarks.
	 *
	 * @param remarks the new remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * Gets the ref id.
	 *
	 * @return the ref id
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * Sets the ref id.
	 *
	 * @param refId the new ref id
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}

	/**
	 * Gets the lst updt ts.
	 *
	 * @return the lst updt ts
	 */
	public LocalDateTime getLstUpdtTs() {
		return lstUpdtTs;
	}

	/**
	 * Sets the lst updt ts.
	 *
	 * @param lstUpdtTs the new lst updt ts
	 */
	public void setLstUpdtTs(LocalDateTime lstUpdtTs) {
		this.lstUpdtTs = lstUpdtTs;
	}

	/**
	 * Gets the lst updt id.
	 *
	 * @return the lst updt id
	 */
	public String getLstUpdtId() {
		return lstUpdtId;
	}

	/**
	 * Sets the lst updt id.
	 *
	 * @param lstUpdtId the new lst updt id
	 */
	public void setLstUpdtId(String lstUpdtId) {
		this.lstUpdtId = lstUpdtId;
	}

	/**
	 * Prepare transaction DTO.
	 *
	 * @param custId the cust id
	 * @param accNo the acc no
	 * @param amount the amount
	 * @param accType the acc type
	 * @param userId the user id
	 * @return the account transaction DTO
	 */
	public static AccountTransactionDTO prepareTransactionDTO(int custId, String accNo, BigDecimal amount, String accType,
			String userId) {
		AccountTransactionDTO transactionDTO = new AccountTransactionDTO();
		transactionDTO.setAcctNo(accNo);
		transactionDTO.setCustId(custId);
		transactionDTO.setTxnTyp(TransactionType.CREDIT.toString().charAt(0));
		transactionDTO.setTxnAmount(amount);
		transactionDTO.setOpeningBal(BigDecimal.valueOf(0.0));
		transactionDTO.setClosingBal(amount);
		char category = TransactionCategory.CASH_BALANCE.toString().charAt(0);
		transactionDTO.setTxnCategory(category);
		transactionDTO.setRemarks("Account Opening");
		transactionDTO.setLstUpdtId(userId);
		transactionDTO.setLstUpdtTs(LocalDateTime.now());
		transactionDTO.setTxnDate(LocalDate.now());
		return transactionDTO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountTransactionDTO [txnId=" + txnId + ", custId=" + custId + ", acctNo=" + acctNo + ", txnDate="
				+ txnDate + ", txnTyp=" + txnTyp + ", txnAmount=" + txnAmount + ", openingBal=" + openingBal
				+ ", closingBal=" + closingBal + ", txnCategory=" + txnCategory + ", remarks=" + remarks + ", refId="
				+ refId + ", lstUpdtTs=" + lstUpdtTs + ", lstUpdtId=" + lstUpdtId + "]";
	}

}

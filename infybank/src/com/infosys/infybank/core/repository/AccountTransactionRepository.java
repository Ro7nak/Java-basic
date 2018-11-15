/**
 * 
 */
package com.infosys.infybank.core.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.infosys.infybank.core.dto.AccountTransactionDTO;

/**
 * The class AccountTransactionRepository.
 */

public class AccountTransactionRepository {
	
	private final static Logger logger = Logger.getLogger(AccountTransactionRepository.class);

	public int save(AccountTransactionDTO accDTO) {
		String query = "insert into  " + JDBCUtil.SCHEMA + ".account_transaction "
				+ "(acct_no , closing_bal, cust_id, lst_updt_id,lst_updt_ts, opening_bal,remarks,txn_category,"
				+ "txn_date,txn_typ,txn_amount)" + "values(?,?,?,?,?,?,?,?,?,?,?)";
		;
		int ret = 0;
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;
		logger.debug( accDTO);
		try {

			jdbcConnection = JDBCUtil.getConnection();
			stmt = jdbcConnection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, accDTO.getAcctNo());
			stmt.setBigDecimal(2, accDTO.getClosingBal());
			stmt.setInt(3, accDTO.getCustId());
			stmt.setString(4, accDTO.getLstUpdtId());
			stmt.setObject(5, accDTO.getLstUpdtTs());
			stmt.setBigDecimal(6, accDTO.getOpeningBal());
			stmt.setString(7, accDTO.getRemarks());
			stmt.setString(8, Character.toString(accDTO.getTxnCategory()));
			stmt.setObject(9, accDTO.getTxnDate());
			stmt.setString(10, Character.toString(accDTO.getTxnTyp()));
			stmt.setBigDecimal(11, accDTO.getTxnAmount());

			stmt.executeUpdate();
			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if (rs.next()) {
					ret = rs.getInt(1);
				}
			}

		} catch (SQLException ex) {
			logger.error(ex.getMessage(), ex);
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				logger.error(e.getMessage(), e);
			}

		}
		return ret;
	}

}

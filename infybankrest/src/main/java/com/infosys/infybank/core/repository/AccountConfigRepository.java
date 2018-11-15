package com.infosys.infybank.core.repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.infosys.infybank.core.dto.AccountConfigDTO;


/**
 * The class AccountConfigRepository.
 */

public class AccountConfigRepository {
	
	private final static Logger logger = Logger.getLogger(AccountConfigRepository.class);
	
	/**
	 * Find minimum balance.
	 *
	 * @param acctType
	 *            the acct type
	 * @return the big decimal
	 */

	public BigDecimal findMinimumBalance(String acctType) {
		BigDecimal ret = null;
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			jdbcConnection = JDBCUtil.getConnection();
			String query = "SELECT MIN_BALANCE FROM " + JDBCUtil.SCHEMA + ".account_config where ACCT_TYPE=?";
			stmt = jdbcConnection.prepareStatement(query);
			stmt.setString(1,acctType);
			rs = stmt.executeQuery();
			while (rs.next()) {
				ret = rs.getBigDecimal(1);
			}

		} catch (SQLException ex) {
			logger.error(ex.getMessage(),ex);
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				logger.error(e.getMessage(),e);
			}

		}
		return ret;
	}

	public List<AccountConfigDTO> getAccountConfigs() {
		String query = "SELECT ACCT_TYPE,INTEREST_RATE, MIN_BALANCE FROM " + JDBCUtil.SCHEMA + ".account_config ";
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<AccountConfigDTO> lstAcctConfig = new ArrayList<>();
 		try {
			jdbcConnection = JDBCUtil.getConnection();
			stmt = jdbcConnection.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				AccountConfigDTO dto = new AccountConfigDTO();
				dto.setAcctType(rs.getString(1).charAt(0));
				
				dto.setInterestRate(rs.getBigDecimal(2));
				dto.setMinBalance(rs.getBigDecimal(2));
				lstAcctConfig.add(dto);
			}

		} catch (SQLException ex) {
			logger.error(ex.getMessage(),ex);
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				JDBCUtil.closeConnection();
			} catch (SQLException e) {
				logger.error(e.getMessage(),e);
			}

		}
		return lstAcctConfig;
	}
}

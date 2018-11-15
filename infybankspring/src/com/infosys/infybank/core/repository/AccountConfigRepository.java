package com.infosys.infybank.core.repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

/**
 * The Class AccountConfigRepository.
 */

@Component
public class AccountConfigRepository {
	
	private final static Logger logger = Logger.getLogger(AccountConfigRepository.class);


	/**
	 * Find minimum balance.
	 *
	 * @param acctType the acct type
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
			stmt.setString(1, acctType);
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
}

package com.infosys.infybank.core.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.infosys.infybank.core.dto.AccountDTO;

/**
 * The Interface AccountRepository.
 */

@Component
public class AccountRepository {

	private final static Logger logger = Logger.getLogger(AccountRepository.class);

	/**
	 * Save.
	 *
	 * @param acctDTO the acct DTO
	 */
	public void save(AccountDTO acctDTO) {
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;
		try {
			jdbcConnection = JDBCUtil.getConnection();
			String query = "insert into " + JDBCUtil.SCHEMA + ".bank_account values(?,?,?,?,?,?,?)";
			stmt = jdbcConnection.prepareStatement(query);
			stmt.setString(1, acctDTO.getAcctNo());
			stmt.setInt(2, acctDTO.getCustId());
			stmt.setString(3, acctDTO.getAcctType());
			stmt.setBigDecimal(4, acctDTO.getBalance());
			stmt.setString(5, acctDTO.getLstUpdtId());
			stmt.setObject(6, acctDTO.getLstUpdtTs());
			stmt.setString(7, acctDTO.getSalaried());
			stmt.executeUpdate();

		} catch (SQLException ex) {
			logger.error(ex.getMessage(),ex);
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				logger.error(e.getMessage(),e);
			}

		}
	}

}

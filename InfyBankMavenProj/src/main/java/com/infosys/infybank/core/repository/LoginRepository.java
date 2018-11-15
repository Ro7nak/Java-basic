package com.infosys.infybank.core.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.infosys.infybank.core.dto.LoginDTO;

/**
 * The Class LoginRepository.
 */

public class LoginRepository {
	private final static Logger logger = Logger.getLogger(LoginRepository.class);
	/**
	 * Find user having user name like.
	 *
	 * @param userId
	 *            the user id
	 * @return the list
	 */
	public List<String> findUserHavingUserNameLike(String userId) {
		List<String> lstUserId = new ArrayList<>();
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {

			jdbcConnection = JDBCUtil.getConnection();
			String query = "SELECT user_id  FROM  " + JDBCUtil.SCHEMA + ".login where user_Id like ?";
			stmt = jdbcConnection.prepareStatement(query);
			stmt.setString(1, userId + "%");
			rs = stmt.executeQuery();
			while (rs.next()) {
				lstUserId.add(rs.getString(1));
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
		return lstUserId;
	}
	
	/** Saves the detail in Login 
	 * @param loginDTO
	 */
	public void save(LoginDTO loginDTO) {
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;

		try {

			jdbcConnection = JDBCUtil.getConnection();
			String query = "insert into  " + JDBCUtil.SCHEMA + ".login values(?,?,?,?,?,?)";
	
			stmt = jdbcConnection.prepareStatement(query);
			stmt.setInt(1, loginDTO.getCustId());
			stmt.setString(2, loginDTO.getLstUpdtId());
			stmt.setObject(3, loginDTO.getLstUpdtTs());
			stmt.setString(4, loginDTO.getPassword());
			stmt.setString(5, Character.toString(loginDTO.getRole()));
			stmt.setString(6, loginDTO.getUserId());

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

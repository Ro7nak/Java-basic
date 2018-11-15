package com.infosys.infybank.core.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.infosys.infybank.core.dto.CustomerDTO;

public class CustomerRepository {
	
	private final static Logger logger = Logger.getLogger(CustomerRepository.class);
	
	/**
	 * Find customer by aadhar id.
	 * 
	 * @param aadharId
	 *            the aadhar id
	 * @return the integer
	 */

	public int findCustomerByAadharId(String aadharId) {
		int ret = 0;
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			jdbcConnection = JDBCUtil.getConnection();
			String query = "SELECT CUST_ID  FROM  " + JDBCUtil.SCHEMA + ".customer where AADHAR_ID = ?";
			stmt = jdbcConnection.prepareStatement(query);
			stmt.setString(1, aadharId);
			rs = stmt.executeQuery();
			while (rs.next()) {
				ret = rs.getInt(1);
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

	/**
	 * Find customer by email id.
	 * 
	 * @param emailId
	 *            the email id
	 * @return the integer
	 */
	public int findCustomerByEmailId(String emailId) {
		int ret = 0;
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {

			jdbcConnection = JDBCUtil.getConnection();
			String query = "SELECT CUST_ID  FROM  " + JDBCUtil.SCHEMA + ".customer where EMAIL_ID=?";

			stmt = jdbcConnection.prepareStatement(query);
			stmt.setString(1, emailId);
			rs = stmt.executeQuery();
			while (rs.next()) {
				ret = rs.getInt(1);
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

	public int save(CustomerDTO custDTO) {
		
			int ret = 0;
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;

		try {
			jdbcConnection = JDBCUtil.getConnection();
			String query = "insert into  " + JDBCUtil.SCHEMA + ".customer " + "(aadhar_id , address, amount_pref, city ,"
					+ "cr_db_notif_limit,date_pref,dob," + "email_id,first_name,last_name," + "lst_updt_id,lst_updt_ts,"
					+ "pan_no,pincode,state)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			stmt = jdbcConnection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, custDTO.getAadharId());
			stmt.setString(2, custDTO.getAddress());
			stmt.setString(3, custDTO.getAmountPref());
			stmt.setString(4, custDTO.getCity());
			stmt.setBigDecimal(5, custDTO.getCrDbNotifLimit());
			stmt.setString(6, custDTO.getDatePref());
			stmt.setObject(7, custDTO.getDob());
			stmt.setString(8, custDTO.getEmailId());
			stmt.setString(9, custDTO.getFirstName());
			stmt.setString(10, custDTO.getLastName());
			stmt.setString(11, custDTO.getLstUpdtId());
			stmt.setObject(12, custDTO.getLstUpdtTs());
			stmt.setString(13, custDTO.getPanNo());
			stmt.setString(14, custDTO.getPincode());
			stmt.setString(15, custDTO.getState());
			stmt.executeUpdate();
			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if (rs.next()) {
					ret = rs.getInt(1);
				}
			}

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

		return ret;
	}

}

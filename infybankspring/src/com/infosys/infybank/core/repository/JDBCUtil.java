package com.infosys.infybank.core.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import com.infosys.infybank.utilities.PropertyUtil;

/**
 * The Class JDBCUtil
 * 
 * @author ETA
 *
 */
public class JDBCUtil {
	private final static Logger logger = Logger.getLogger(JDBCUtil.class);
	/**
	 * The schema
	 */
	public static String SCHEMA;
	/**
	 * The jdbc connection
	 * 
	 */
	private static Connection jdbcConnection = null;

	/**
	 * creating Connection
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnection() {

		if ( null == jdbcConnection) {
			Properties prop = PropertyUtil.getProperties();
			SCHEMA = prop.getProperty("SCHEMA");
			try {
				Class.forName(prop.getProperty("JDBC_DRIVER"));
			} catch (ClassNotFoundException e) {
				logger.error(e.getMessage(), e);
			}
			try {
				jdbcConnection = DriverManager.getConnection(prop.getProperty("JDBC_URL"), prop.getProperty("USER"),
						prop.getProperty("PASSWORD"));
				jdbcConnection.setAutoCommit(false);
			} catch (SQLException e) {
				logger.error(e.getMessage(), e);
			}

		}

		return jdbcConnection;
	}

	/**
	 * Closing connection
	 */
	public static void closeConnection() {
		if (jdbcConnection != null) {
			try {
				jdbcConnection.close();
				jdbcConnection = null;
			} catch (SQLException e) {
				logger.error(e.getMessage(), e);
			}
		}

	}

	public static void commit() {
		try {
			jdbcConnection.commit();
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
		}

	}

	/**
	 * The commit
	 * 
	 */
	public static void rollback() {
		try {
			jdbcConnection.rollback();
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);
		}
	}
}

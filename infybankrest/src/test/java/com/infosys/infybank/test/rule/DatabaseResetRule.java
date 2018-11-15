package com.infosys.infybank.test.rule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import com.infosys.infybank.core.repository.JDBCUtil;

public class DatabaseResetRule implements TestRule {
	final static Logger logger = Logger.getLogger(DatabaseResetRule.class);
	@Override
	public Statement apply(final Statement base, Description description) {
		
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				// code here executes before test runs
				logger.debug("Before");
				
				clearDatabase();
				base.evaluate();
				// code here executes after test is finished
				logger.debug("After");
			}
		};
	}

	private void clearDatabase() {
		// write code to clear the database.
		logger.debug("Clearing");
		String query = "delete FROM flightsimulator.account_transaction";
		String query1 = "delete FROM flightsimulator.bank_account";
		String query2 = "delete FROM flightsimulator.login";
		String query3 = "delete FROM flightsimulator.customer";
	
		
		Connection jdbcConnection = null;
		PreparedStatement stmt = null;

		try {
			jdbcConnection = JDBCUtil.getConnection();
			jdbcConnection.setAutoCommit(false);
			stmt = jdbcConnection.prepareStatement(query);
			stmt.executeUpdate();
			stmt.close();
			stmt = jdbcConnection.prepareStatement(query1);
			stmt.executeUpdate();
			stmt = jdbcConnection.prepareStatement(query2);
			stmt.executeUpdate();
			stmt = jdbcConnection.prepareStatement(query3);
			stmt.executeUpdate();
			jdbcConnection.commit();
		
		} catch (Exception ex) {
			logger.error(ex.getMessage(),ex);
			try {
				jdbcConnection.rollback();
			} catch (SQLException e) {
				logger.error(e.getMessage(),e);
			}
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

package com.infosys.infybank.test.rule;

import org.junit.runners.model.Statement;

/**
 * The Class DatabaseStatement
 *
 */
public class DatabaseStatement extends Statement {

	/* (non-Javadoc)
	 * @see org.junit.runners.model.Statement#evaluate()
	 */
	@Override
	public void evaluate() throws Throwable {
		// code here executes before test runs
		clearDatabase();
		evaluate();
		// code here executes after test is finished
	}

	/**
	 *  clear database
	 */
	private void clearDatabase() {
		// write code to clear the database.
		//System.out.println("Database cleared");
	}
}

package com.infosys.infybank.test.rule;

import org.junit.runners.model.Statement;
/**
 * The Class DatabaseStatement
 *
 */
public class DatabaseStatement extends Statement {

	@Override
	public void evaluate() throws Throwable {
		// code here executes before test runs
		clearDatabase();
		evaluate();
		// code here executes after test is finished
	}

	private void clearDatabase() {
		// write code to clear the database.
		//System.out.println("Database cleared");
	}
}

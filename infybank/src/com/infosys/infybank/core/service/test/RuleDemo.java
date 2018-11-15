package com.infosys.infybank.core.service.test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;

/**
 * The Class RuleDemo
 */
public class RuleDemo {
	/**
	 * Rule Test name
	 */
	@Rule
	public TestName name = new TestName();

	/**
	 * Rule TemporaryFolder
	 */
	@Rule
	public TemporaryFolder temporaryFolder = new TemporaryFolder();

	/**
	 * Rule Timeout
	 */
	@Rule
	public Timeout timeout = new Timeout(1000, TimeUnit.MILLISECONDS);

	/**
	 * Rule ErrorCollector
	 */
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	/**
	 * prints first name
	 */
	@Test
	public void firstTest() {
		System.out.println(name.getMethodName());// Will print firstTest in
													// console
	}

	/**
	 * @throws IOException
	 */
	@Test
	public void testRun() throws IOException {
		temporaryFolder.newFile("myfile.txt");
		File createdFolder = temporaryFolder.newFolder("subfolder");
		// code to test the methods
		assertTrue(temporaryFolder.newFolder().exists());
		assertTrue(createdFolder.exists());
	}

	/**
	 * 
	 */
	@Test
	public void testSomething() {
		collector.addError(new Throwable("First thing  wrong"));
		collector.addError(new Throwable("Second thing wrong"));
		String result = doStuff();
		collector.checkThat(result, not(containsString("Oh, not again an error")));
	}

	/**
	 * @return
	 */
	private String doStuff() {
		return "Oh, not again an error";
	}

}

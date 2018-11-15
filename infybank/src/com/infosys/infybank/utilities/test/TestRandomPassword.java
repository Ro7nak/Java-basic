package com.infosys.infybank.utilities.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.infosys.infybank.utilities.RandomPasswordGenerator;

public class TestRandomPassword {

	@Test
	public void testgeneratePswd() {
		String output = RandomPasswordGenerator.generatePswd();
		assertNotNull(output);
	}

}

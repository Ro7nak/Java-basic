package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.infosys.infybank.core.dto.LoginDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;

//Step 1
@RunWith(Parameterized.class)
public class TestCustomerWithParam {
	private CustomerService customerservice = new CustomerService();

	// Step 2
	private String firstName;
	private String lastName;
	private String result;

	// Step 3
	public TestCustomerWithParam(String firstName, String lastName, String result) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.result = result;
	}

	// Step 4
	@Parameters
	public static Iterable<Object[]> inputs() {
		return Arrays.asList(new Object[][] { { "John", "Smith", "johnsmit" }, { "Jack", "Horld", "jackhorl" },
				{ "Boby", "Ronald", "bobyrona" } });
	}

	@Test
	public void testCreateUserProfile() throws InfyBankServiceException {
		// Step 5
		LoginDTO testresult = customerservice.createUserProfile(firstName, lastName);

		assertEquals(result, testresult.getUserId());
	}

}
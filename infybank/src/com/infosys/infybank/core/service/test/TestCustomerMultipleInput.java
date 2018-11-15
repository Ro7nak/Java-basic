package com.infosys.infybank.core.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.infosys.infybank.core.dto.LoginDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;

public class TestCustomerMultipleInput {
	private CustomerService customerservice = new CustomerService();
	private String userId = "johnsmit";
	private String userId1 = "bobysmit";
	private String userId2 = "rajaroha";

	@Test
	public void testCreateUserProfile() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("John", "Smith");
		assertEquals(userId, result.getUserId());
	}

	@Test
	public void testCreateUserProfile1() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("Boby", "Smith");
		assertEquals(userId1, result.getUserId());
	}

	@Test
	public void testCreateUserProfile2() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("Rajan", "Rohal");
		assertEquals(userId2, result.getUserId());
	}
}
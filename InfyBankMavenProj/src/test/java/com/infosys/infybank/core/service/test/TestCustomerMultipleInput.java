package com.infosys.infybank.core.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.infosys.infybank.core.dto.LoginDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
/**
 * The Class TestCustomerMultipleInput
 *
 */
public class TestCustomerMultipleInput {
	
	/**
	 * The customerservice
	 */
	private CustomerService customerservice = new CustomerService();
	/**
	 * The userid
	 */
	private String userId = "johnsmit";
	/**
	 * The userid1
	 */
	private String userId1 = "bobysmit";
	/**
	 * The userid2
	 */
	private String userId2 = "rajaroha";

	/**
	 * @throws InfyBankServiceException
	 */
	@Test
	public void testCreateUserProfile() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("John", "Smith");
		assertEquals(userId, result.getUserId());
	}

	/**
	 * @throws InfyBankServiceException
	 */
	@Test
	public void testCreateUserProfile1() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("Boby", "Smith");
		assertEquals(userId1, result.getUserId());
	}

	/**
	 * @throws InfyBankServiceException
	 */
	@Test
	public void testCreateUserProfile2() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("Rajan", "Rohal");
		assertEquals(userId2, result.getUserId());
	}
}
package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.infosys.infybank.core.dto.LoginDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.category.InvalidCategory;
import com.infosys.infybank.test.category.ValidCategory;

public class TestCustomerServiceWithCategory {

	private CustomerService customerservice = new CustomerService();
	private String userId = "johnsmit";
	private String userId1 = "bobysmit";
	private String userId2 = "rajaroha";

	@Category(ValidCategory.class)
	@Test
	public void testCreateUserProfileValidCase() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("John", "Smith");
		assertEquals(userId, result.getUserId());
	}

	@Category(InvalidCategory.class)
	@Test
	public void testCreateUserProfileInValidCase() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("Boby", "Smith");
		assertEquals(userId1, result.getUserId());
	}

	@Test
	public void testCreateUserProfileValidCase2() throws InfyBankServiceException {
		LoginDTO result = customerservice.createUserProfile("Rajan", "Rohal");
		assertEquals(userId2, result.getUserId());
	}

}
package com.infosys.infybank.core.service.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.rule.DatabaseResetRule;

/**
 * The Class TestCustomerServiceWithFixture
 *
 */
public class TestCustomerServiceWithFixture {
	private static RegistrationDTO dto;
	private static CustomerService service;
	@ClassRule
	public static DatabaseResetRule dbRule = new DatabaseResetRule();

	/**
	 * @throws ParseException
	 */
	@BeforeClass
	public static void setup() throws ParseException {
		dto = new RegistrationDTO();
		service = new CustomerService();
		dto.setAadharId("201123203432");
		dto.setAcctType("C");
		dto.setAddress("Jamshedpur");
		dto.setBalance(new BigDecimal(5000));
		dto.setCity("Jamshedpur");
		dto.setDob(new SimpleDateFormat("dd-MM-yyyy").parse("12-12-2000"));
		dto.setEmailId("rajan@gmail.com");
		dto.setFirstName("Rajan");
		dto.setLastName("Singh");
		dto.setPanNo("AHWBW4567Z");
		dto.setPincode("599456");
		dto.setSalaried("Y");
		dto.setState("Gujarat");
	}

	/**
	 * @throws InfyBankServiceException
	 */
	@Test
	public void testRegisterCustomerValid() throws InfyBankServiceException {
		assertTrue(service.registerCustomer(dto));
	}

	/**
	 * 
	 */
	@Test
	public void testRegisterCustomerInValid() {
		try {
			assertFalse(service.registerCustomer(dto));
		} catch (InfyBankServiceException e) {
		}
	}

	/**
	 * destroy object
	 */
	@AfterClass
	public static void destroyInput() {
		dto = null;
		service = null;
	}
}
package com.infosys.infybank.core.service.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.utility.XMLUtil;

public class TestCustomerServiceWithXML {
	private static RegistrationDTO dto;
	private static CustomerService service = new CustomerService();;

	@BeforeClass
	public static void setup() {
		dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
	}

	@Test
	public void testRegisterCustomerValid() throws InfyBankServiceException {
		assertTrue(service.registerCustomer(dto));
	}

	@Test
	public void testRegisterCustomerInValid() throws InfyBankServiceException {
		assertFalse(service.registerCustomer(dto));
	}

	@AfterClass
	public static void destroyInput() {
		service = null;
		dto = null;
	}

}

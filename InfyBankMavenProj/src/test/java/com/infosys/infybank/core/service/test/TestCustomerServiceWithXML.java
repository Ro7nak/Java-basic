package com.infosys.infybank.core.service.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.main.RegisterCustomerApp;
import com.infosys.infybank.test.rule.DatabaseResetRule;
import com.infosys.infybank.test.utility.XMLUtil;

/**
 * The Class TestCustomerServiceWithXML 
 *
 */
public class TestCustomerServiceWithXML {
	private final static Logger logger = Logger.getLogger(RegisterCustomerApp.class);
	private static RegistrationDTO dto;
	private static CustomerService service = new CustomerService();
	@ClassRule
	public static DatabaseResetRule dbRule = new DatabaseResetRule();
	/**
	 * Reading xml
	 */
	@BeforeClass
	public static void setup() {
		dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
	}

	/**
	 * @throws InfyBankServiceException
	 */
	@Test
	public void testRegisterCustomerValid() throws InfyBankServiceException {
		assertTrue(service.registerCustomer(dto));
	}

	/**
	 *  check invalid customer
	 */
	@Test
	public void testRegisterCustomerInValid() {
		try {
			assertFalse(service.registerCustomer(dto));
		} catch (InfyBankServiceException e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * destroy object
	 */
	@AfterClass
	public static void destroyInput() {
		service = null;
		dto = null;
	}

}

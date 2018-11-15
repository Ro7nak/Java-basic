
package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.rule.DatabaseResetRule;
import com.infosys.infybank.test.utility.XMLUtil;

/**
 * The Class TestCustomerServiceFinal
 *
 */
public class TestCustomerServiceFinal {
	
	/**
	 * The RegistrationDTO
	 */
	private static RegistrationDTO dto;
	/**
	 * The RegistrationDTO
	 */
	private static RegistrationDTO dtoForTimeOut;

	/**
	 * The Customer Service
	 * 
	 */
	private static CustomerService service;
	/**
	 * The database reset rule
	 */
	@ClassRule
	public static DatabaseResetRule dbRule = new DatabaseResetRule();
	
	/**
	 * 
	 */
	@BeforeClass
	public static void setup() {
		dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		//System.out.println("dto" + dto);
		dtoForTimeOut = (RegistrationDTO) XMLUtil.getObject("ValidCustomerForTimeOut.xml", RegistrationDTO.class);
		//System.out.println("dto" + dtoForTimeOut);

		service = new CustomerService();
	}

	/**
	 * @throws InfyBankServiceException
	 */
	@Test
	public void testRegisterCustomerValid() throws InfyBankServiceException {
		assertTrue(service.registerCustomer(dto));
	}


	/**
	 * @throws InfyBankServiceException
	 */
	@Test(expected = InfyBankServiceException.class)
	public void testRegisterCustomerAlreadyRegisteredCase() throws InfyBankServiceException {
		service.registerCustomer(dto);
	}

	/**
	 * timeout 3000
	 * @throws InfyBankServiceException
	 */
	@Test(timeout = 3000)
	public void testRegisterCustomerTimeOut() throws InfyBankServiceException {
		assertTrue(service.registerCustomer(dtoForTimeOut));

	}

	/**
	 * destroy object
	 */
	@AfterClass
	public static void destroyInput() {
		service = null;
		dto = null;
		dtoForTimeOut = null;
	}

}

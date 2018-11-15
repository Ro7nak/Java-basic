package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;

import com.infosys.infybank.test.utility.XMLUtil;

/**
 * The Class TestCustomerServiceExceptionRule
 *
 */
public class TestCustomerServiceExceptionRule {
	/**
	* 
	*/
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * @throws InfyBankServiceException
	 */
	@Test
	public void test() throws InfyBankServiceException {
		RegistrationDTO dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		CustomerService service = new CustomerService();
		thrown.expect(InfyBankServiceException.class);
		thrown.expectMessage("Customer is already registered");
		assertTrue(service.registerCustomer(dto));
	}
}

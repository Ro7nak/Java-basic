package com.infosys.infybank.core.service.test;


import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;

import com.infosys.infybank.test.utility.XMLUtil;

/**
 * The Class TestCustomerServiceForException
 *
 */
public class TestCustomerServiceForException {
		
	

	/**
	 * @throws InfyBankServiceException
	 */
	@Test(expected = InfyBankServiceException.class)
	public void testRegisterCustomerAlreadyRegisteredCase() throws InfyBankServiceException {
		RegistrationDTO dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		CustomerService service = new CustomerService();
		service.registerCustomer(dto);
	}

}

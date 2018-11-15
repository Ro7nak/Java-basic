package com.infosys.infybank.core.service.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.utility.XMLUtil;

public class TestCustomerServiceWithTimeOut {

	@Test(timeout = 3000)
	public void testRegisterCustomerTimeOut() throws InfyBankServiceException {
		RegistrationDTO dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		CustomerService service = new CustomerService();
		assertTrue(service.registerCustomer(dto));

	}
}
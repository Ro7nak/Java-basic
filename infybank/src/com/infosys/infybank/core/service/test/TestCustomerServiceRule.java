package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.rule.DatabaseResetRule;
import com.infosys.infybank.test.utility.XMLUtil;

public class TestCustomerServiceRule {
	private RegistrationDTO dto;
	@ClassRule
	public static DatabaseResetRule dbRule = new DatabaseResetRule();

	@Before
	public void createInput() {
		dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		System.out.println(dto);

	}

	@Test
	public void testRegisterCustomerValid() throws InfyBankServiceException {

		CustomerService service = new CustomerService();
		assertTrue(service.registerCustomer(dto));

	}

}

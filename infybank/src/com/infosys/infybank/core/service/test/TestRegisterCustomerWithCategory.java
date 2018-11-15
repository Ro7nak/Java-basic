package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.category.InvalidCategory;
import com.infosys.infybank.test.category.ValidCategory;
import com.infosys.infybank.test.utility.XMLUtil;

public class TestRegisterCustomerWithCategory {

	@Category(ValidCategory.class)
	@Test
	public void testRegisterCustomerRegisteredCase() throws InfyBankServiceException {
		RegistrationDTO dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		CustomerService service = new CustomerService();
		assertTrue(service.registerCustomer(dto));

	}

	@Category(InvalidCategory.class)
	@Test(expected = InfyBankServiceException.class)
	public void testRegisterCustomerAlreadyRegisteredCase() throws InfyBankServiceException {
		RegistrationDTO dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		CustomerService service = new CustomerService();
		service.registerCustomer(dto);

	}
}
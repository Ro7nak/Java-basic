package com.infosys.infybank.core.service.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.ClassRule;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.main.RegisterCustomerApp;
import com.infosys.infybank.test.rule.DatabaseResetRule;
import com.infosys.infybank.test.utility.XMLUtil;

/**
 * The Class TestCustomerServiceWithTimeOut
 *
 */
public class TestCustomerServiceWithTimeOut {
	private final static Logger logger = Logger.getLogger(RegisterCustomerApp.class);
	@ClassRule
	public static DatabaseResetRule dbRule = new DatabaseResetRule();
	/**
	 * @throws InfyBankServiceException
	 */
	@Test(timeout = 3000)
	public void testRegisterCustomerTimeOut()  {
		RegistrationDTO dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		CustomerService service = new CustomerService();
		try {
			assertTrue(service.registerCustomer(dto));
		} catch (InfyBankServiceException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
			//e.printStackTrace();
		}

	}
}
package  com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.test.utility.XMLUtil;


/**
 * The Class TestCustomer.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={com.infosys.infybank.Config.class})
public class TestCustomerService {
	
	/** The service. */
	@Autowired
	private CustomerService service;
	
	/**
	 * Test register customer validsuccess.
	 *
	 * @throws InfyBankServiceException the infy bank service exception
	 */
	@Test
	public void testRegisterCustomerValidsuccess() throws InfyBankServiceException {
		RegistrationDTO dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		assertTrue(service.registerCustomer(dto));

	}
}

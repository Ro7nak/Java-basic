package com.infosys.infybank.core.service.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;

/**
 * The Class TestCustomerService
 *
 */
public class TestCustomerService {
	
	/**
	 * @throws InfyBankServiceException
	 * @throws ParseException
	 */
	@Test
	public void testRegisterCustomerValid() throws InfyBankServiceException, ParseException {
		RegistrationDTO dto = new RegistrationDTO();
		dto.setAadharId("201123203432");
		dto.setAcctType("C");
		dto.setAddress("Jamshedpur");
		dto.setBalance(new BigDecimal(5000));
		dto.setCity("Jamshedpur");
		dto.setDob(new SimpleDateFormat("dd-MM-yyyy").parse("12-12-2000"));
		dto.setEmailId("rajan@gmail.com");
		dto.setFirstName("Rajan");
		dto.setLastName("Singh");
		dto.setPanNo("AHWBW4567Z");
		dto.setPincode("599456");
		dto.setSalaried("Y");
		dto.setState("Gujarat");
		CustomerService service = new CustomerService();
		Assert.assertTrue(service.registerCustomer(dto));
	}
	
	
	 /*//To run this test use validate() method in Customerservice class which returns boolean
	  @Test
	   public void testRegisterCustomerInValid() throws InfyBankServiceException, ParseException{
	        RegistrationDTO dto = new RegistrationDTO();
	        dto.setAadharId("201123203432");
	        dto.setAcctType("C");
	        dto.setAddress("Jamshedpur");
	        dto.setBalance(new BigDecimal(5000));
	        dto.setCity("Jamshedpur");
	        dto.setDob(new SimpleDateFormat("dd-MM-yyyy").parse("12-12-2000"));
	        dto.setEmailId("rajan@gmail.com");
	        dto.setFirstName("Rajan");
	        dto.setLastName("Singh");
	        dto.setPanNo("AHWBW4567Z");
	        dto.setPincode("599456");
	        dto.setSalaried("Y");
	        dto.setState("Gujarat");
	        CustomerService service = new CustomerService();
	        Assert.assertFalse(service.registerCustomer(dto));
	   }
*/
}

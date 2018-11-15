package com.infosys.infybank.core.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;

import com.infosys.infybank.core.dto.CustomerDTO;
import com.infosys.infybank.core.dto.LoginDTO;
import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.repository.CustomerRepository;
import com.infosys.infybank.core.repository.JDBCUtil;
import com.infosys.infybank.exception.InfyBankServiceException;
import com.infosys.infybank.utilities.RandomPasswordGenerator;
import com.infosys.infybank.utilities.UserProfile;

/**
 * Customer Service class for registeration
 * 
 * @author ETA Java
 * @version 1.0
 */

public class CustomerService {
	private final static Logger logger = Logger.getLogger(CustomerService.class);
	
	private CustomerRepository customerRepository = new CustomerRepository();

	private AccountService accountService = new AccountService();

	private LoginService loginService = new LoginService();

	

	/**
	 * Register customer.
	 *
	 * @param obj
	 *            the obj
	 * @return true, if successful
	 * @throws InfyBankServiceException
	 *             the infy bank service exception
	 */
	public boolean registerCustomer(RegistrationDTO obj) throws InfyBankServiceException {
		try {
			
			/* uncomment this if using boolean validate method
			  boolean var = validate(obj);
            if (!var) {
              return false;
            }*/
			
			validate(obj);
			
			
			// insertion into customer table
			CustomerDTO custDTO = CustomerDTO.prepareCustomerDTO(obj);
			setDefaultValues(custDTO);
			LoginDTO loginDTO = createUserProfile(obj.getFirstName(), obj.getLastName());
			custDTO.setLstUpdtId(loginDTO.getUserId());
			int ret = customerRepository.save(custDTO);
			custDTO.setCustId(ret);
			if (custDTO.getCustId() <= 0) {

				throw new InfyBankServiceException("CustId generation failed");
			}

			// insertion into login table
			loginDTO.setCustId(custDTO.getCustId());
			loginService.saveUserProfile(loginDTO);

			// insert into account and transaction tables
			int txnId = accountService.openAccountAndCreditAmount(custDTO.getCustId(), obj.getBalance(),
					obj.getAcctType(), loginDTO.getUserId(), obj.getSalaried());
			if (txnId <= 0) {
				throw new InfyBankServiceException("Transaction failed");
			}
			JDBCUtil.commit();
		} catch (InfyBankServiceException ex) {
			JDBCUtil.rollback();
			throw ex;
		} catch (Exception ex) {
			JDBCUtil.rollback();
			logger.error(ex.getMessage(),ex);
		} finally {
			JDBCUtil.closeConnection();
		}

		return true;
	}

	/**
	 * Checks if is customer registered with email and aadhar.
	 * 
	 * @param obj
	 *            : RegistrationDTO
	 * @throws InfyBankServiceException
	 *             the infy bank service exception
	 */
	
	private void validate(RegistrationDTO obj) throws InfyBankServiceException {
		if (isCustomerRegisteredWithAadhar(obj.getAadharId()) || isCustomerRegisteredWithEmail(obj.getEmailId())) {
			throw new InfyBankServiceException("Customer is already registered");
		}

	}
	
	/* Earlier implementation which returned only true and false uncomment this and comment above 
	 * implementation for running testRegisterCustomerInValid() of TestCustomerService.java
	 * 
	 */
	/*private boolean validate(RegistrationDTO obj) throws InfyBankServiceException {
        if (isCustomerRegisteredWithAadhar(obj.getAadharId()) || isCustomerRegisteredWithEmail(obj.getEmailId())) {
            return false;
           
        } else
            return true;
    }*/
	

	/**
	 * Sets the default values.
	 *
	 * @param custEntity
	 *            the new default values
	 */
	private void setDefaultValues(CustomerDTO custDto) {
		custDto.setCrDbNotifLimit(new BigDecimal(5000.0));
		custDto.setAmountPref("lakhs");
		custDto.setDatePref("dd-MM-yyyy");
		custDto.setLstUpdtTs(LocalDateTime.now());
	}

	/**
	 * Creates the user profile.
	 *
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 * @return the login
	 * @throws InfyBankServiceException
	 *             the infy bank service exception
	 */
	public LoginDTO createUserProfile(String firstName, String lastName) throws InfyBankServiceException {
		String userIdSuggestion = UserProfile.suggestUserIdFromName(firstName, lastName);
		List<String> userList = loginService.verifyUserNameExistence(userIdSuggestion);
		if (userList != null && userList.size() > 0)
			userIdSuggestion = UserProfile.createUserId(userList, userIdSuggestion);
		String securePassword = RandomPasswordGenerator.generateHashPswd();

		LoginDTO login = new LoginDTO(0, userIdSuggestion, securePassword, 'C', userIdSuggestion);
		return login;
	}

	/**
	 * Checks if is customer registered with aadhar.
	 * 
	 * @param aadharId
	 *            :aadhar id
	 * @return true, if is customer registered with aadhar
	 */
	private boolean isCustomerRegisteredWithAadhar(String aadharId) {
		int custId = customerRepository.findCustomerByAadharId(aadharId);
		if (custId == 0)
			return false;
		return true;
	}

	/**
	 * Checks if is customer registered with email.
	 * 
	 * @param emailId
	 *            : email id
	 * @return true, if is customer registered with email
	 */
	private boolean isCustomerRegisteredWithEmail(String emailId) {
		int custId = customerRepository.findCustomerByEmailId(emailId);
		if (custId == 0)
			return false;
		return true;
	}

}

package com.infosys.infybank.core.service;

import java.util.List;

import com.infosys.infybank.core.dto.LoginDTO;
import com.infosys.infybank.core.repository.LoginRepository;

/**
 * Login Service class for creating login details
 * 
 * @author ETA Java
 * @version 1.0
 */
public class LoginService {

	/** The login repository. */

	private LoginRepository loginRepository = new LoginRepository();

	/**
	 * Verify user name existence.
	 *
	 * @param userName
	 *            the user name
	 * @return the list
	 */
	public List<String> verifyUserNameExistence(String userName) {
		return loginRepository.findUserHavingUserNameLike(userName);
	}

	/**
	 * Save user profile.
	 *
	 * @param login
	 *            the login
	 * @return the login
	 */
	public void saveUserProfile(LoginDTO login) {

		loginRepository.save(login);
	}

}
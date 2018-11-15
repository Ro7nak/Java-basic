package com.infosys.infybank.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.infybank.core.dto.LoginDTO;
import com.infosys.infybank.core.repository.LoginRepository;

/**
 * The Class LoginService.
 */
@Service
public class LoginService {

	/** The login repository. */

	@Autowired
	private LoginRepository loginRepository;

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
	 */
	public void saveUserProfile(LoginDTO login) {

		loginRepository.save(login);
	}

}
package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import com.infosys.infybank.core.service.LoginService;


/**
 * The Class TestLoginService
 *
 */
public class TestLoginService {
	
	private LoginService loginService = new LoginService();

	/**
	 *  verify existing user has item
	 */
	@Test
	public void verifyUserNameExistencelist2() {
		List<String> lstUserId = new ArrayList<>();
		lstUserId = loginService.verifyUserNameExistence("deepraj#");
		assertThat(lstUserId, hasItems("deepraj#"));
	}

	/**
	 * verify existing user list
	 */
	@Test
	public void verifyUserNameExistencelist3() {
		List<String> lstUserId = new ArrayList<>();
		lstUserId = loginService.verifyUserNameExistence("deepraj#");
		assertThat(lstUserId.size(), is(1));
	}

}

package com.infosys.infybank.core.service.test;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import com.infosys.infybank.core.service.LoginService;

public class TestLoginService {

	private LoginService loginService = new LoginService();

	@Test
	public void verifyUserNameExistencelist2() {
		List<String> lstUserId = new ArrayList<>();
		lstUserId = loginService.verifyUserNameExistence("rajasing");
		assertThat(lstUserId, hasItems("rajasing"));
	}

	@Test
	public void verifyUserNameExistencelist3() {
		List<String> lstUserId = new ArrayList<>();
		lstUserId = loginService.verifyUserNameExistence("rajasing");
		assertThat(lstUserId.size(), is(1));
	}

}

package com.infosys.infybank.utilities.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.infosys.infybank.utilities.UserProfile;

import org.junit.Assert;

/**
 * The Class TestUserProfile
 *
 */
public class TestUserProfile {
	List<String> userList = new ArrayList<>();
	String userIdSuggestion;

	/**
	 * User id created
	 */
	@Test
	public void testcreateUserId() {
		userList.add("Manoj");
		userList.add("Manoj1");
		userList.add("Manoj01");
		userIdSuggestion = "Manoj";
		String retUserId = UserProfile.createUserId(userList, userIdSuggestion);
		String a = "Manoj0";
		Assert.assertEquals(retUserId, a);
	}

}

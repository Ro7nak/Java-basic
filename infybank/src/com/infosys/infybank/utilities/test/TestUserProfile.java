package com.infosys.infybank.utilities.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.infosys.infybank.test.rule.DatabaseResetRule;
import com.infosys.infybank.utilities.UserProfile;

import org.junit.Assert;
import org.junit.ClassRule;

public class TestUserProfile {
	@ClassRule
	public static DatabaseResetRule dbRule = new DatabaseResetRule();	
	List<String> userList = new ArrayList<>();
	String userIdSuggestion;

	@Test
	public void testcreateUserId() {
		userList.add("ManojJai");
		userList.add("ManojJai0");
		userList.add("ManojJai1");
		userIdSuggestion = "ManojJai";
		String retUserId = UserProfile.createUserId(userList, userIdSuggestion);
		String a = "ManojJai2";
		Assert.assertEquals(retUserId, a);
	}
	
	@Test
	public void testSuggestUserIdFromName(){
		String firstName = "Manoj";
		String lastName = "Jain";
		String userIdSuggestion = UserProfile.suggestUserIdFromName(firstName, lastName);
		Assert.assertEquals("manojain", userIdSuggestion);
	}
	
	@Test
	public void testSuggestUserIdFromNameLenghtChanged(){
		String firstName = "Raj";
		String lastName = "Jain";
		String userIdSuggestion = UserProfile.suggestUserIdFromName(firstName, lastName);
		Assert.assertEquals("raj#jain", userIdSuggestion);
	}
	

}

package com.infosys.infybank.utilities;

import java.util.List;

/**
 * The Class UserProfile.
 */
public class UserProfile {

	/**
	 * Creates the user id.
	 *
	 * @param userList the user list
	 * @param userIdSuggestion the user id suggestion
	 * @return the string
	 */
	public static String createUserId(List<String> userList, String userIdSuggestion) {
		String userId = userIdSuggestion;
		for (int i = 0; i < 100; i++) {
			if (userList.contains(userId)) {
				userId = userIdSuggestion + i;
			}
		}
		return userId;
	}

	/**
	 * Suggest user id from name.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @return the string
	 */
	public static String suggestUserIdFromName(String firstName, String lastName) {

		if (firstName.length() < 4)
			firstName = makeConstantLength(firstName);
		if (lastName.length() < 4)
			lastName = makeConstantLength(lastName);

		String userIdSuggestion = firstName.substring(0, 4).toLowerCase() + lastName.substring(0, 4).toLowerCase();
		return userIdSuggestion;
	}

	/**
	 * Make constant length.
	 *
	 * @param name the name
	 * @return the string
	 */
	private static String makeConstantLength(String name) {
		StringBuilder constantLengthName = new StringBuilder(name);
		int length = name.length();
		for (int i = length; i <= 4; i++) {
			constantLengthName.append("#");
		}
		return constantLengthName.toString();
	}
}
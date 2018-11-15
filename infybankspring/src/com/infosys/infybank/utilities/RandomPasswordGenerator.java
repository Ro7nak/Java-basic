package com.infosys.infybank.utilities;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang3.RandomStringUtils;


import com.infosys.infybank.exception.InfyBankServiceException;

/**
 * The Class RandomPasswordGenerator.
 */
public class RandomPasswordGenerator {


	/**
	 * Generate pswd.
	 *
	 * @return the string
	 */
	public static String generatePswd() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String pwd = RandomStringUtils.random(8, characters);
		return pwd;
	}

	/**
	 * Generate hash pswd.
	 *
	 * @return the string
	 * @throws InfyBankServiceException the infy bank service exception
	 */
	public static String generateHashPswd() throws InfyBankServiceException {
		String passwordToHash = generatePswd();
		return getHashPwd(passwordToHash);

	}

	/**
	 * Gets the hash pwd.
	 *
	 * @param input the input
	 * @return the hash pwd
	 * @throws InfyBankServiceException the infy bank service exception
	 */
	public static String getHashPwd(String input) throws InfyBankServiceException {

		String hashedOutput = null;
		if (null == input)
			return null;
		try {

			// Create MessageDigest object for MD5
			MessageDigest digest = MessageDigest.getInstance("MD5");

			// Update input string in message digest
			digest.update(input.getBytes(), 0, input.length());

			// Converts message digest value in base 16 (hex)
			hashedOutput = new BigInteger(1, digest.digest()).toString(16);

		} catch (NoSuchAlgorithmException e) {

			throw new InfyBankServiceException(	"Secure password creation failed");
		}
		return hashedOutput;
	}


}

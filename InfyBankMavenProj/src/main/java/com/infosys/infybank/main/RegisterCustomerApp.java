package com.infosys.infybank.main;

import java.math.BigDecimal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.apache.log4j.Logger;
import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;

public class RegisterCustomerApp {
	private final static Logger logger = Logger.getLogger(RegisterCustomerApp.class);
	public static void main(String[] args) {
		//BasicConfigurator.configure();
        //PropertyConfigurator.configure("log4j.properties");
		RegisterCustomerApp rcust = new RegisterCustomerApp();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1: Register new Custmer\n" + "2: Exit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rcust.captureInput();
				break;
			case 2:
				System.exit(1);
			default:
				System.out.println("Wrong choice enterered.Enter your choice again");
				break;
			}
			sc.close();
		}
	}
	
private void captureInput() {
		
		RegistrationDTO dto = new RegistrationDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below details to Register New Customer");
		System.out.println("Enter First name:");
		String fname = sc.next();
		dto.setFirstName(fname);
		System.out.println("Enter Last name:");
		String lname = sc.next();
		dto.setLastName(lname);
		System.out.println("Enter PAN details:");
		String pan = sc.next();
		dto.setPanNo(pan);
		System.out.println("Enter Aadhar id:");
		String adharId = sc.next();
		dto.setAadharId(adharId);
		System.out.println("Enter Email ID:");
		String email = sc.next();
		dto.setEmailId(email);
		System.out.println("Enter Customer DOB (dd-MM-yyyy)");
		String dob = sc.next();
		// String DOB to Date
		java.util.Date dobl;
		try {
			dobl = new SimpleDateFormat("dd-MM-yyyy").parse(dob);

			dto.setDob(dobl);
		} catch (ParseException e1) {
			logger.error(e1.getMessage());
			}

		System.out.println("Enter Address:");
		String add = sc.next();
		dto.setAddress(add);
		System.out.println("Enter City:");
		String city = sc.next();
		dto.setCity(city);
		System.out.println("Enter Pincode:");
		String pin = sc.next();
		dto.setPincode(pin);
		System.out.println("Enter State:");
		String state = sc.next();
		dto.setState(state);
		System.out.println("Enter Account Type:(For Current Account:C / For Savings: S)");
		String accType = sc.next();
		dto.setAcctType(accType);
		System.out.println("Enter amount to be deposited");
		BigDecimal amt = sc.nextBigDecimal();
		dto.setBalance(amt);
	
		System.out.println("You want to make this account Salaried? Y/N");
		String salr = sc.next();
		dto.setSalaried(salr);

		CustomerService service = new CustomerService();
		try {
			service.registerCustomer(dto);
			logger.debug("Customer Registered sucessfully! Your loginId and password details will be sent to your mail");
		} catch (InfyBankServiceException e) {
			logger.error(e.getMessage() + ". Please try again");
		}
		finally{
			sc.close();
		}
	}

}

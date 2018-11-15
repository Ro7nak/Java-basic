package com.infosys.infybank.resource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.infosys.infybank.core.dto.RegistrationDTO;

import com.infosys.infybank.core.service.CustomerService;
import com.infosys.infybank.exception.InfyBankServiceException;

@Path("/customers")
public class CustomerResource {
	final static Logger logger = Logger.getLogger(CustomerResource.class);
	CustomerService custService = new CustomerService();
	
	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)

	public boolean register(RegistrationDTO registerationDTO) {
		//System.out.println("enter");
		try {
			return custService.registerCustomer(registerationDTO);
		} catch (InfyBankServiceException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(),e);
		}
		return false;

	}
	
}

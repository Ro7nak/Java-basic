package com.infosys.infybank.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.infosys.infybank.core.dto.AccountConfigDTO;
import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.core.service.AccountConfigService;

@Path("/acctconfigs")
public class AccountConfigResource {

	AccountConfigService acctConfigService = new AccountConfigService();

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)

	public List<AccountConfigDTO> getAccountConfigDetails(RegistrationDTO registerationDTO) {
		return acctConfigService.getAccountConfigs();

	}

}

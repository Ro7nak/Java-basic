package com.infosys.infybank.core.resource;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import com.infosys.infybank.core.dto.RegistrationDTO;
import com.infosys.infybank.test.rule.DatabaseResetRule;
import com.infosys.infybank.test.utility.XMLUtil;

public class TestCustomerResource extends JerseyTest{
	RegistrationDTO dto ;
	@ClassRule
	public static DatabaseResetRule dbRule = new DatabaseResetRule();
	@Override
	public Application configure() {
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new ResourceConfig(com.infosys.infybank.resource.CustomerResource.class);
	}
	@Before
	public void createInput() {
		dto = (RegistrationDTO) XMLUtil.getObject("ValidCustomer.xml", RegistrationDTO.class);
		System.out.println(dto);

	}
	@Test
	public void testRegisterCustomer() {
			Response output = target("/customers").request().post(Entity.entity(dto,MediaType.APPLICATION_JSON));
			Assert.assertEquals("Should return status 200", 200,output.getStatus());
			boolean retVal = output.readEntity(Boolean.class);
			Assert.assertTrue(retVal);

	}
}

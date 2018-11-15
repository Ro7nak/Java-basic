package com.infosys.infybank.test.utility;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;


public class XMLUtil {
	final static Logger logger = Logger.getLogger(XMLUtil.class);
	public static Object getObject(String fileName, Class dtoClass) {
		try {

			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(dtoClass);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			return jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			logger.error(e.getMessage(),e);
		}
		return null;

	}

}

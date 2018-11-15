package com.infosys.infybank.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;


public class PropertyUtil {
	private final static Logger logger = Logger.getLogger(PropertyUtil.class);
	private static Properties prop;

	static {
		prop = new Properties();

		try (InputStream input = new FileInputStream("config.properties")) {

			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			logger.error("Error occured in reading property file");
			logger.error(ex.getMessage(),ex);
		}
	}

	public static Properties getProperties() {
		return prop;
	}
}

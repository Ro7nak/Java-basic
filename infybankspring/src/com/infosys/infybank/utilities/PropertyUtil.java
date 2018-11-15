package com.infosys.infybank.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;



/**
 * The Class PropertyUtil.
 */
public class PropertyUtil {
	
	/** The prop. */
	private static Properties prop;
	final static Logger logger = Logger.getLogger(PropertyUtil.class);
	static {
		prop = new Properties();

		try (InputStream input = new FileInputStream("config.properties")) {

			// load a properties file
			prop.load(input);
		} catch (IOException ex) {
			logger.debug("Error occured in reading property file");
			logger.error(ex.getMessage(),ex);
		}
	}

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	public static Properties getProperties() {
		return prop;
	}
}

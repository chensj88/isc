package com.winning.isc.base.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @add Ren,zhong
 * @version 2014-07-15
 * @modify 注销，不在使用
 * @version 2018-11-02
 * @deprecated
 */
public class FtpPropertiesLoader {

	private static final Logger logger = LoggerFactory.getLogger(FtpPropertiesLoader.class);

	private static Properties properties = new Properties();

	static {
		InputStream in2 = FtpPropertiesLoader.class.getResourceAsStream("/ftp.properties");

		if (in2 == null) {
			logger.info("===ftp.properties not found===");
		} else {
			if (!(in2 instanceof BufferedInputStream))
				in2 = new BufferedInputStream(in2);
			try {
				properties.load(in2);
				in2.close();
				logger.info("===ftp.properties loaded===");
			} catch (Exception e) {
				logger.error("Error while processing ftp.properties");
				throw new RuntimeException("Error while processing ftp.properties", e);
			}
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public static void setProperty(String key, String value) {
		properties.setProperty(key, value);
	}
	
}

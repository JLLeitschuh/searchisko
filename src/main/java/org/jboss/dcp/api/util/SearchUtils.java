/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 */
package org.jboss.dcp.api.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Utility class for search
 * 
 * @author Libor Krzyzanek
 * 
 */
public class SearchUtils {

	/**
	 * Load properties from defined path e.g. "/app.properties"
	 * 
	 * @param path
	 * @return newly intialized {@link Properties}
	 * @throws IOException
	 * @see {@link Class#getResourceAsStream(String)}
	 */
	public static Properties loadProperties(String path) throws IOException {
		Properties prop = new Properties();
		InputStream inStream = SearchUtils.class.getResourceAsStream(path);
		prop.load(inStream);
		inStream.close();

		return prop;
	}

}

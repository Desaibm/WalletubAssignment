package com.Utilities;

import java.io.FileReader;
import java.util.Properties;

public class ReadProperties {

	public static String readproperty1(String filePath, String key) {

		try {
			FileReader fileReader = new FileReader(filePath);
			Properties properties = new Properties();
			properties.load(fileReader);
			String value = properties.getProperty(key);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}

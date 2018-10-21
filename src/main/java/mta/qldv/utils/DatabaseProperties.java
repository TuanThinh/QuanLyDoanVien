package mta.qldv.utils;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DatabaseProperties {
	static private Map<String, String> data = new HashMap<String, String>();
	static {
		Properties prop = new Properties();
		try {
			prop.load(DatabaseProperties.class.getResourceAsStream("/database.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			data.put(key, prop.getProperty(key));
		}
	}
	
	public static String getData(String key) {
		String string = "";
		if (data.containsKey(key)) {
			string = data.get(key);
		}
		return string;
	}
}

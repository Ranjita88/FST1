package utils;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public String getPropertyValue(String key) throws FileNotFoundException, IOException {
		String propValue;
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "/src/main/resources/resource.properties")));
		/*
		 * try( prop.load(new File(System.getProperty("user.dir") +
		 * "/src/main/resources/resource.properties")); propValue =
		 * prop.getProperty(key); )catch(FileNotFoundException e);{ propValue = null;
		 * e.printStackTrace(); }
		 */
		return propValue;
		
		
	}
	
}

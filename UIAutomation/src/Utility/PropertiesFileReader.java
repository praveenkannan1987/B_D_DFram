package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	public Properties getProperty() throws IOException{
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("resources/config.properties"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
}

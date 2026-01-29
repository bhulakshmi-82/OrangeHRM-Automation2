package Utilities;

import java.io.InputStream;
import java.util.Properties;

public class propertyReader {
	

	    public static Properties loadProperties()
	    {
	        Properties prop = new Properties();
	        try {
	            InputStream is = propertyReader.class
	                    .getClassLoader()
	                    .getResourceAsStream("Data.properties");
	            prop.load(is);
	            } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        return prop;
	    }

	}
	

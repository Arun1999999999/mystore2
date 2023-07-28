package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	public String returningDataFromFile(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./src/test/resources/credential.properties");
		Properties prop=new Properties();
		prop.load(file);
	String	url=prop.getProperty(key);
		return url;
		}
	
	

}

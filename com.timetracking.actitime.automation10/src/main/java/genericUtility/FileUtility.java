package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String fetchDataFromPropertyFile(String key) throws IOException
	{
		
	FileInputStream fs=new FileInputStream("./src/test/resources/propertyfile.docx");
	Properties property=new Properties();
	property.load(fs);
	
	return property.getProperty(key);
	
	
	
	
	
	
	}
}

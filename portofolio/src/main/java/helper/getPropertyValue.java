package helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class getPropertyValue {
    String result = "";
	InputStream inputStream;
 
	public String getPropValues() throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "src/main/java/element/homepage.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			System.out.println(result + "Ran on " + time);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
            
		} finally {
			inputStream.close();
		}

		return result;
	}
}

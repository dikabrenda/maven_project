package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Objects;

public class loadElement {

    public static Properties ELEMENT_PROPERTIES;
    
    public loadElement(String directory) {
        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();
        ELEMENT_PROPERTIES = new Properties();

        for(int i = 0; i < ((File[])Objects.requireNonNull(listOfFiles)).length; ++i) {
            if (listOfFiles[i].isFile() && listOfFiles[i].toString().contains(".properties")) {
                try {
                    ELEMENT_PROPERTIES.load(new FileInputStream(directory + listOfFiles[i].getName()));
                } catch (IOException var6) {
                    var6.printStackTrace();
                    // LogUtil.error("Failed to load properties : " + listOfFiles[i].getName(), var6);
                }
            }
        }

    }
}

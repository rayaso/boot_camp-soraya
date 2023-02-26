package pom_automation_scalduplit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    public static Properties prop;

    String path = System.getProperty("user.dir") + File.separator + "src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator + "prop.properties";


    public Configuration() {

        prop = new Properties();

        try {

            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);


        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static String getUrl() {

        String Url = prop.getProperty("Url");

        if (Url != null) {

            return Url;

        } else {

            throw new RuntimeException("Url key has no value");

        }
    }
}














package pom_w3schools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigW3Schools {
    public static Properties prop;

    String path = System.getProperty("user.dir") + File.separator + "src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator + "prop.properties";


    public ConfigW3Schools() {

        prop = new Properties();

        try {

            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);


        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static String getUrl() {

        String url = prop.getProperty("url");

        if (url != null) {

            return url;

        } else {

            throw new RuntimeException("Url key has no value");

        }}

}

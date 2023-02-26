package pom_google;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GoogleConfiguration {

    public static Properties propp;

    String pathh = System.getProperty("user.dir") + File.separator + "src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator + "propp.properties";


    public GoogleConfiguration() {

        propp = new Properties();

        try {

            FileInputStream fis = new FileInputStream(pathh);
            propp.load(fis);


        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static String getUrl() {

        String url = propp.getProperty("url");

        if (url != null) {

            return url;

        } else {

            throw new RuntimeException("Url key has no value");

        }
    }
}















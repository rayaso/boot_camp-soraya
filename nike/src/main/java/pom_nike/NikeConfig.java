package pom_nike;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NikeConfig {



    public static Properties prop;

    String pathh = System.getProperty("user.dir") + File.separator + "src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator + "prop.properties";


    public NikeConfig() {

        prop = new Properties();

        try {

            FileInputStream fis = new FileInputStream(pathh);
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

        }
    }}

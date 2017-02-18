package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by eshaparenko on 11/9/2016.
 */

public class ConnectionProperties {
    private static ConnectionProperties INSTANCE = null;
    public Properties prop = null;

    private ConnectionProperties() {
        InputStream is = null;
        this.prop = new Properties();

        try {
            File f = new File("./src/test/Configuration/Config.property");
            is = new FileInputStream(f);
        } catch (Exception e) {
            is = null;
        }

        try {
            if (is == null) {
                // Try loading from classpath
                is = getClass().getResourceAsStream("./src/test/Configuration/Config.property");
            }
            // Try loading properties from the file (if found)
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ConnectionProperties getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionProperties();
        }
        return INSTANCE;
    }
}

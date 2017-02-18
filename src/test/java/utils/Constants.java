package utils;

/**
 * Created by eshaparenko on 2/18/2017.
 */
public class Constants {
    private static ConnectionProperties properties = ConnectionProperties.getInstance();
    public static final String APP_URL = properties.prop.getProperty("app_url");
    public static final String BROWSER = properties.prop.getProperty("browser");
}

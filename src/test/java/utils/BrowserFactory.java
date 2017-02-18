package utils;

import com.codeborne.selenide.Configuration;
public class BrowserFactory {
    public static void Create(String browser)
    {
        if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "src\\test\\driverLocation\\geckodriver.exe");
            Configuration.browser="marionette";
        }
        else{
            System.setProperty("webdriver.chrome.driver", "src\\test\\driverLocation\\chromedriver.exe");
            Configuration.browser = "chrome";
        }
    }
}

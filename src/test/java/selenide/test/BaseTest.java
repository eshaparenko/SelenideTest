package selenide.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by eshaparenko on 2/18/2017.
 */
public class BaseTest {
    @BeforeTest
    public void Before(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\driverLocation\\chromedriver.exe");
        Configuration.browser = "chrome";
        open(Constants.APP_URL);
    }
}

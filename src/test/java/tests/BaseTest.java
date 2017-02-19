package tests;

import org.testng.annotations.BeforeTest;
import utils.BrowserFactory;
import utils.Constants;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by eshaparenko on 2/18/2017.
 */
public class BaseTest {
    @BeforeTest(groups = {"book"})
    public void Before(){
        System.out.println("book");
        BrowserFactory.Create(Constants.BROWSER);
        open(Constants.APP_URL);
    }
}

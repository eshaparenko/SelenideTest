package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by eshaparenko on 2/18/2017.
 */
public class Chapter1 {
    Chapter1(){
        page(this);
    }
    @FindBy(id = "divontheleft")
    private SelenideElement pageLocator;
    @FindBy(xpath = "//a[text()='Home Page']")
    private SelenideElement homePageLink;

    public void isPageOpened(){
        pageLocator.shouldHave(exactText("Assert that this text is on the page"));
        sleep(1000);
    }

    public void goToMainPage(){
        homePageLink.click();
    }

}

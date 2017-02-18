package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by eshaparenko on 2/18/2017.
 */
public class Chapter1 {
    public void isPageOpened(){
        $(By.id("divontheleft")).shouldHave(exactText("Assert that this text is on the page"));
        sleep(1000);
    }

    public void goToMainPage(){
        $(By.xpath("//a[text()='Home Page']")).click();
    }

}

package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage {
    public Chapter1 goToChapter(Chapters chapter) {
        switch (chapter) {
            case chapter1:
                $(By.xpath("//a[contains(@href, 'chapter1')]")).click();
                break;
        }
        return new Chapter1();
    }
    public void isPageOpened(){
        $(By.className("mainheading")).shouldHave(exactText("Selenium: Beginners Guide"));
        sleep(1000);
    }
}

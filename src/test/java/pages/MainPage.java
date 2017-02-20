package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage {
    public MainPage(){
        page(this);
    }
    @FindBy(how = How.XPATH, using = "//a[contains(@href, 'chapter1')]")
    private  SelenideElement chapterOne;
    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private SelenideElement pageLocator;

    public Chapter1 goToChapter(Chapters chapter) {
        switch (chapter) {
            case chapter1:
                chapterOne.click();
                break;
        }
        return new Chapter1();
    }
    public void isPageOpened(){
        pageLocator.shouldHave(exactText("Selenium: Beginners Guide"));
        sleep(1000);
    }
}

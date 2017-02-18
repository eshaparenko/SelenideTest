package selenide.test;
import com.codeborne.selenide.Configuration;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.Chapters;
import pages.Pages;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class BookTest extends BaseTest {
    @Test
    public void goToChapterTest(){
        Pages.mainPage.goToChapter(Chapters.chapter1);
        Pages.chapter1.isPageOpened();
        Pages.chapter1.goToMainPage();
        Pages.mainPage.isPageOpened();
    }

}

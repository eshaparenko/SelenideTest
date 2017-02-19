package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Chapters;
import pages.Pages;
import utils.BrowserFactory;
import utils.Constants;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookTest extends BaseTest {

    @Test(groups = {"book"})
    public void goToChapterTest(){
        Pages.mainPage.goToChapter(Chapters.chapter1);
        Pages.chapter1.isPageOpened();
        Pages.chapter1.goToMainPage();
        Pages.mainPage.isPageOpened();
    }

    @Test(groups = {"base"})
    public void simpleTest(){
        System.out.println("base");
        Assert.assertEquals("1", "2");
    }

}

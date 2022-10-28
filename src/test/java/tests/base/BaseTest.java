package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import pages.base.BasePage;
import pages.blog.BlogPage;
import pages.blogCategory.BlogCategory;
import pages.main.MainPage;
import pages.slot.SlotPage;
import pages.slotCategory.SlotCategory;


public class BaseTest {

    public BasePage basePage;
    public MainPage mainPage;
    public BlogCategory blogCategory;
    public BlogPage blogPage;
    public SlotCategory slotCategory;
    public SlotPage slotPage;

    public void startDriver (String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "main" :
            case "blogCategory" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "blog" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
            case "slotCategory" :
                driver = CommonActions.createDriver("CHROME", 640, 360);
                break;
            case "slot" :
                driver = CommonActions.createDriver("CHROME", 768, 1024);
                break;
        }
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        blogCategory = new BlogCategory(driver);
        blogPage = new BlogPage(driver);
        slotCategory = new SlotCategory(driver);
        slotPage = new SlotPage(driver);
    }

    @AfterMethod
    public void clearCookiesAndExit () {
        basePage.clearCookiesAndLocalStorageAndClose();
    }
}

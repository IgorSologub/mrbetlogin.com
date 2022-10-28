package pages.blogCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.main.MainPage;

public class BlogCategory extends BasePage {

    public BlogCategory(WebDriver driver) {super(driver);}

    private final By secondPageButton = By.xpath("(//a[@class='X2EdswN2X'])[1]");

    public BlogCategory blogButtonClick (int numButton) {
        By blogButton = By.xpath("(//a[contains(@class,'T6RLKxQs')])[" + numButton + "]");
        driver.findElement(blogButton).click();
        return this;
    }

    public BlogCategory registerNowButtonClick (int numButton) {
        By registerNowButton = By.xpath("(//a[contains(@class,'l_IODUyqp wFzjfTj D-jE7m UUEdatG0IL js-reg')])[" + numButton + "]");
        driver.findElement(registerNowButton).click();
        return this;
    }

    public BlogCategory secondPageButtonClick () {
        driver.findElement(secondPageButton).click();
        return this;
    }

}

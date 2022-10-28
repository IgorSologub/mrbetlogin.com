package pages.blog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.blogCategory.BlogCategory;

public class BlogPage extends BasePage {

    public BlogPage(WebDriver driver) {super(driver);}

    public BlogPage registerNowButtonClick (int numButton) {
        By registerNowButton = By.xpath("(//a[contains(@class,'l_IODUyqp wFzjfTj D-jE7m UUEdatG0IL js-reg')])[" + numButton + "]");
        driver.findElement(registerNowButton).click();
        return this;
    }

}

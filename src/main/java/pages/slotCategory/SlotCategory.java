package pages.slotCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.blogCategory.BlogCategory;
import pages.main.MainPage;

public class SlotCategory extends BasePage {

    public SlotCategory(WebDriver driver) {super(driver);}

    private final By viewAllButton = By.xpath("//a[@class='fpWc3']");

    public SlotCategory registerNowButtonClick (int numButton) {
        By registerNowButton = By.xpath("(//a[contains(@class,'l_IODUyqp wFzjfTj D-jE7m UUEdatG0IL js-reg')])[" + numButton + "]");
        driver.findElement(registerNowButton).click();
        return this;
    }

    public SlotCategory slotButtonClick (int numButton) {
        By slotButton = By.xpath("(//a[contains(@class,'I0bPu-j2d')])[" + numButton + "]");
        driver.findElement(slotButton).click();
        return this;
    }

    public SlotCategory viewAllButtonClick () {
        driver.findElement(viewAllButton).click();
        return this;
    }

}

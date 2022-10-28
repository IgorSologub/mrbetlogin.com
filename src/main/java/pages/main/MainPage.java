package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}

    public MainPage slotButtonClick (int numButton) {
        By slotButton = By.xpath("(//a[contains(@class,'I0bPu-j2d')])[" + numButton + "]");
        driver.findElement(slotButton).click();
        return this;
    }

    public MainPage registerNowButtonClick (int numButton) {
        By registerNowButton = By.xpath("(//a[contains(@class,'l_IODUyqp wFzjfTj D-jE7m UUEdatG0IL js-reg')])[" + numButton + "]");
        driver.findElement(registerNowButton).click();
        return this;
    }
}

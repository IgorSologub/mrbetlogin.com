package pages.slot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.slotCategory.SlotCategory;

public class SlotPage extends BasePage {

    public SlotPage(WebDriver driver) {super(driver);}

    private final By playForMoneyButton = By.xpath("//a[@class='l_IODUyqp eYT120 eewNF8r5xhE tukflVFNzzp']");
    private final By closeHeaderWidgetButton = By.xpath("//button[@class='PNubmTrt8dP']");


    public SlotPage playForMoneyButtonClick () {
        driver.findElement(playForMoneyButton).click();
        return this;
    }

    public SlotPage closeHeaderWidgetButtonClick () {
        driver.findElement(closeHeaderWidgetButton).click();
        return this;
    }

}

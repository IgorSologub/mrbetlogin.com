package tests.slot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Footer.FOOTER_TITLES;
import static constants.Constant.Footer.NUMBER_OF_GOOD_FOOTER_BUTTONS;
import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Reg.REG_TITLES;
import static constants.Constant.Urls.MAIN_PAGE_URL;
import static constants.Constant.Urls.SLOT_PAGE_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SlotTest extends BaseTest {

    @BeforeMethod
    public void setUp () {
        startDriver("slot");
        basePage.goToUrl(SLOT_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void headerButtonsTest () {
        basePage.closePopup();
        slotPage.closeHeaderWidgetButtonClick();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_HEADER_BUTTONS; i++) {
            basePage.waitOneSeconds();
            basePage.headerOpenClick();
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(SLOT_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void footerButtonsTest () {
        basePage.closePopup();
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_FOOTER_BUTTONS; i++) {
            basePage.waitOneSeconds();
            basePage.footerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(FOOTER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(SLOT_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_FOOTER_BUTTONS, goodTitlesCount);
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void mainLogoLinkTest () {
        basePage.closePopup();
        slotPage.closeHeaderWidgetButtonClick();
        basePage.waitOneSeconds();
        basePage.headerOpenClick();
        basePage.waitOneSeconds();
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test(invocationCount = 2, successPercentage = 99)
    public void playForMoneyButtonTest () {
        basePage.closePopup();
        basePage.waitOneSeconds();
        slotPage.playForMoneyButtonClick();
        basePage.nextTab();
        basePage.waitThirtySeconds();
        assertTrue(basePage.checkTitles(REG_TITLES));
        basePage.closeTabAndMoveToNext();
    }

}

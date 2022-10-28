package constants;

import java.util.Arrays;
import java.util.List;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 20;
    }

    public static class Urls {
        public static final String MAIN_PAGE_URL = "https://mrbetlogin.com/";
        public static final String BLOG_CATEGORY_PAGE_URL = "https://mrbetlogin.com/blog/";
        public static final String BLOG_CATEGORY_SECOND_PAGE_URL = "https://mrbetlogin.com/blog/page/2/";
        public static final String BLOG_PAGE_URL = "https://mrbetlogin.com/mr-bet-verification/";
        public static final String SLOT_CATEGORY_PAGE_URL = "https://mrbetlogin.com/mr-bet-verification/";
        public static final String SLOT_PAGE_URL = "https://mrbetlogin.com/age-of-discovery/";
    }

    public static class Header {
        public static final List<String> HEADER_TITLES = Arrays.asList(
                "Mr Bet Betting Review",
                "Mr Bet Casino App New Zealand",
                "Mrbet 10 Euro NZ",
                "Mr Bet Australia",
                "Mr Bet NZ",
                "Mr Bet Online Casino"
        );
        public static final int NUMBER_OF_GOOD_HEADER_BUTTONS = 5;

        public static final List<String> LANGUAGE_URLS = Arrays.asList(
                "/fr/"
        );
        public static final int MAX_AMOUNT_LANGUAGE_CHANGE_BUTTONS = 10;
    }

    public static class Footer {
        public static final List<String> FOOTER_TITLES = Arrays.asList(
                "Mr Bet Online Casino",
                "Blog",
                "About Us",
                "Gaming Dealer at",
                "Terms and Conditions",
                "Privacy Policy",
                "Cookies Policy",
                "Responsible Gambling"
        );
        public static final int NUMBER_OF_GOOD_FOOTER_BUTTONS = 8;
    }

    public static class Reg {
        public static final List<String> REG_TITLES = Arrays.asList(
                "Club Casino",
                "Mr.Bet",
                "Mr.bet casino"
        );
        public static final int NUMBER_OF_REGISTER_NOW_BUTTON_MAIN_PAGE = 2;
        public static final int NUMBER_OF_REGISTER_NOW_BUTTON_BLOG_CATEGORY_PAGE = 2;
        public static final int NUMBER_OF_REGISTER_NOW_BUTTON_BLOG_PAGE = 1;
        public static final int NUMBER_OF_REGISTER_NOW_BUTTON_SLOT_CATEGORY_PAGE = 1;
    }

    public static class Reviews {

        public static final List<String> REVIEW_TITLES = Arrays.asList(
                "Age Of Discovery",
                "King Queen Slot",
                "Explosive Reels",
                "Emperors Wealth",
                "Chunjie",
                "Wild Toro",
                "Wild Seas",
                "Tropicool",
                "Royal Secrets",
                "Sapphire Lagoon",
                "Jolly Beluga",
                "Pyramid Of Gold",
                "Pot O Luck",
                "Great Queen Bee",
                "Beetle Star",
                "Alaska Wild",
                "Mr Bet Withdrawal",
                "Mr Bet Verification",
                "Mrbet Casino Login New Zealand",
                "Mr Bet Download",
                "Mr Bet Casino Test",
                "Mr Bet Apk",
                "Mr Bet Affiliates",
                "Mr Bet Slots",
                "Mr Bet Sign up Bonus"
        );
        public static final List<String> AUTHORS_TITLES = Arrays.asList(
                "Denis Carter"
        );
        public static final List<String> CITIES_TITLES = Arrays.asList(
                "Aberdeen"
        );
        public static final int NUMBER_OF_SLOT_BUTTON_MAIN_PAGE = 16;
        public static final int NUMBER_OF_BLOG_BUTTON_BLOG_CATEGORY_PAGE = 9;
        public static final int NUMBER_OF_SLOT_BUTTON_SLOT_CATEGORY_PAGE = 16;
    }

    public static class Common {
        public static final int NUMBER_OF_FAQ_COLLAPSE_BUTTONS = 4;
    }

    public static class CommentForm {
        public static final String TOPIC = "TestTest123";
        public static final String NAME = "TestTest123";
        public static final String EMAIL = "testtest123@gmail.com";
        public static final String SUBJECT = "TestTest123";
        public static final String COMMENT = "TesttestTesttest123";
        public static final String EMPTY = "";
        public static final int NUMBER_OF_ERROR_MESSAGE = 3;
    }
}

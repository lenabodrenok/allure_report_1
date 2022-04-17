package guru.qa;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    //@BeforeAll
    //static void setUp() {
    //    Configuration.holdBrowserOpen = true;
    //    Configuration.baseUrl = "https://github.com";
    //    Configuration.browserSize = "1920x1080";

    @Test
    public void githubIssueTest() {
        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").submit();

        $(linkText("eroshenkoam/allure-example")).click();
        $(partialLinkText("Issues")).click();
        $(withText("#76")).click();

    }
}


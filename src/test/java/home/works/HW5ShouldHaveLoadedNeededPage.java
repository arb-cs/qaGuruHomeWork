package home.works;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HW5ShouldHaveLoadedNeededPage {

    @Test
    void rightPageIsLoadedTest() {
        open("https://github.com");
        $$("[type='button']").findBy(text("Solutions")).hover();
        $("[href='https://github.com/enterprise']").click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}

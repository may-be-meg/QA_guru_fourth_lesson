package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelectPricingTest {

    @Test
    void shouldFindComparePlans() {

        open("https://github.com/");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $(".h1").shouldHave(text("Compare features"));
        sleep(5000);
    }
}
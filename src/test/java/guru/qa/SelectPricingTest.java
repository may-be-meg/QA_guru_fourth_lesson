package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelectPricingTest {
    @Test
    void shouldFindComparePlans() {

        open("https://github.com/");
        //в хэдэре находим элемент Pricing и наводим на него мышкой
        $(".HeaderMenu").$(byText("Pricing")).hover();
        //в появившемся меню выбираем пункт Compare plans
        $(byText("Compare plans")).click();
        //проверяем, что открылась нужная страница (находим Compare features)
        $(".h1").shouldHave(text("Compare features"));
    }
}
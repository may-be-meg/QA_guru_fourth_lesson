package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @Test
    void DragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //actions().clickAndHold($("#column-a")).moveByOffset(850, 150).release().perform();
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
    }
}

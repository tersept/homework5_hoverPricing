package com.github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release();  // проверка через action
        //$("div.column").shouldHave(Condition.text("B")); // не работает
        $("#column-a").dragAndDropTo($("#column-b"));
        $("div.column").shouldHave(Condition.text("B"));
    }
}

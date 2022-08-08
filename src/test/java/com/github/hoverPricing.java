package com.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class hoverPricing {
    @Test
    void hover() {
        open("http://github.com");
        $("html").hover();
        $("[aria-label = Global]").$(byText("Pricing")).hover();
        $("[aria-label = Global]").$(byText("Pricing")).sibling(0).$(byText("Compare plans")).click();
        $("h1.h2-mktg").shouldHave(text("Choose the plan "));
    }
}

package ru.tinkoff.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CashboxPage extends BasePage {

    @Step("Проверяем видимость кнопки 'Подключить'")
    public void buttonVisibilityConnect() {
        $("[data-qa-type='uikit/button']").$(byText("Подключить")).shouldBe(enabled);
    }
}

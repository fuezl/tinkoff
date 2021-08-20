package ru.tinkoff.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage extends BasePage {

    @Step("Проверяем появление полей после ввода номера")
    public void checkingThePhoneNumberInputField() {
        $("[name='login']").shouldBe(visible);
    }
}

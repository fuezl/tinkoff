package ru.tinkoff.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {

    @Step("Открываем главную страницу tinkoff.ru")
    public void openMainPage() {
        open("https://www.tinkoff.ru/");
    }
}

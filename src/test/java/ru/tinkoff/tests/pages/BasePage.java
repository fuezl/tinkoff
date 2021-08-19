package ru.tinkoff.tests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    @Step("Нажимаем кнопку 'Инвестиции' в шапке сайта")
    public void pressTheButtonInvestments() {
        $("[data-qa-type='uikit/navigation.menu'] [href='/invest/']", 0).click();
    }
}

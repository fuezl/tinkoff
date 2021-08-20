package ru.tinkoff.tests.pages;

import io.qameta.allure.Step;
import ru.tinkoff.data.MenuItem;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    @Step("Нажимаем кнопку 'Инвестиции' в шапке сайта")
    public void pressTheButtonInvestments() {
        $("[data-qa-type='uikit/navigation.menu']").$(byText(MenuItem.INVESTMENTS.toString())).click();
    }

    @Step("Нажимаем кнопку 'Бизнес' в шапке сайта")
    public void pressTheButtonBusiness() {
        $("[data-qa-type='uikit/navigation.menu']").$(byText(MenuItem.BUSINESS.toString())).click();
    }

    @Step("Нажимаем кнопку 'Касса' в шапке сайта")
    public void pressTheButtonCashbox() {
        $("[data-qa-type='uikit/navigation.menu']").$(byText(MenuItem.CASHBOX.toString())).click();
    }

    @Step("Нажимаем кнопку 'Войти' в шапке сайта")
    public void pressLogin() {
        $("[data-qa-type='uikit/navigation.container']").$(byText("Войти")).click();
    }
}

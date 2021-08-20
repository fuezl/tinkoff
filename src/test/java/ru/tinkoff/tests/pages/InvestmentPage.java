package ru.tinkoff.tests.pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class InvestmentPage extends BasePage {

    @Step("Проверяем кнопку 'Открыть счёт' на недоступность клика по ней")
    public void checkTheButtonOpenAnAccountDisabled() {
        $("div[data-qa-file='auth']>button").scrollTo().shouldBe(disabled);
    }

    @Step("Проверяем кнопку 'Открыть счёт' на возможность клика по ней")
    public void checkConfirmationCode() {
        $("[name='code']").shouldBe(visible);
    }

    @Step("Вводим номер телефона в поле ввода мобильного телефона")
    public void inputPhoneNumber() {
        $("div[data-qa-type='uikit/input'] input[name='login']")
                .setValue(new Faker().numerify("89#########")).pressEnter();
    }
}

package ru.tinkoff.tests.pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class BusinessPage extends BasePage {

    @Step("Вводим номер телефона для заявки на расчётный счёт")
    public void inputPhoneNumber() {
        $("input[name='phoneNumber']")
                .scrollTo()
                .sendKeys(new Faker().numerify("9#########"));
    }

    @Step("Проверяем появление полей после ввода номера")
    public void validationOfInputFields() {
        $("input[name='companyInfo_companyName']").shouldBe(enabled);
        $("input[name='companyInfo_inn_or_ogrn']").shouldBe(enabled);
        $("input[name='companyInfo_fio']").shouldBe(enabled);
    }
}

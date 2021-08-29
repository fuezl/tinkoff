package ru.tinkoff.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.tinkoff.tests.pages.*;


public class TinkoffTests extends TestBase {

    @Test
    @DisplayName("Проверка доступности клика по кнопке 'Открыть счёт' после ввода номера телефона")
    void checkTheButtonOpenAnAccountAfterInputPhoneNumber() {
        // Arrange
        HomePage homePage = new HomePage();
        homePage.openMainPage();
        // Act
        homePage.pressTheButtonInvestments();
        // Assert
        InvestmentPage investmentPage = new InvestmentPage();
        investmentPage.inputPhoneNumber();
        investmentPage.checkConfirmationCode();
    }

    @Test
    @DisplayName("Проверка появления полей ввода после ввода телефона в заявке на расчётный счёт")
    void checkingTheAppearanceOfTheCurrentAccountFields() {
        // Arrange
        HomePage homePage = new HomePage();
        homePage.openMainPage();
        // Act
        homePage.pressTheButtonBusiness();
        // Assert
        BusinessPage businessPage = new BusinessPage();
        businessPage.inputPhoneNumber();
        businessPage.validationOfInputFields();
    }

    @Test
    @DisplayName("Проверка появления полей ввода после ввода телефона в заявке на расчётный счёт")
    void buttonVisibilityCheckConnect() {
        // Arrange
        HomePage homePage = new HomePage();
        homePage.openMainPage();
        // Act
        homePage.pressTheButtonCashbox();
        // Assert
        new CashboxPage().buttonVisibilityConnect();
    }

    @Test
    @DisplayName("Проверка видимости поля для авторизации")
    void buttonVisibilityAuthorizationField() {
        // Arrange
        HomePage homePage = new HomePage();
        homePage.openMainPage();
        // Act
        homePage.pressLogin();
        // Assert
        new RegistrationPage().checkingThePhoneNumberInputField();
    }

    @Test
    @DisplayName("Проверка недоступности клика по кнопке 'Открыть счёт' без ввода данных")
    void checkTheButtonOpenAnAccount() {
        // Arrange
        HomePage homePage = new HomePage();
        homePage.openMainPage();
        // Act
        homePage.pressTheButtonInvestments();
        // Assert
        new InvestmentPage().checkTheButtonOpenAnAccountDisabled();
    }
}

package ru.tinkoff.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.tinkoff.tests.pages.HomePage;
import ru.tinkoff.tests.pages.InvestmentPage;


public class TinkoffTests extends TestBase {

    @Test
    @DisplayName("Проверка недоступности клика по кнопке 'Открыть счёт' без ввода данных")
    void checkTheButtonOpenAnAccount() {
        // Arrange
        HomePage homePage = new HomePage();
        homePage.openMainPage();
        // Act
        homePage.pressTheButtonInvestments();
        // Assert
        InvestmentPage investmentPage = new InvestmentPage();
        investmentPage.checkTheButtonOpenAnAccountDisabled();
    }

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
        investmentPage.checkTheButtonOpenAnAccountEnabled();
    }
}

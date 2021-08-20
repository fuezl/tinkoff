package ru.tinkoff.data;

public enum MenuItem {
    BANK("Банк"),
    BUSINESS("Бизнес"),
    CASHBOX("Касса"),
    INVESTMENTS("Инвестиции"),
    INSURANCE("Страхование"),
    SIM_CARD("Сим-карта"),
    TRIPS("Путешествия"),
    ENTERTAINMENT("Развлечения");

    private final String displayedName;

    MenuItem(String displayedName) {
        this.displayedName = displayedName;
    }

    public String getDisplayedName() {
        return displayedName;
    }


    @Override
    public String toString() {
        return displayedName;
    }
}

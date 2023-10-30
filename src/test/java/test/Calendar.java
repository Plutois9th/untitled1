package test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Calendar {

    private final String name;
    private final SelenideElement selectorCalendar;
    private final SelenideElement selectorDay;
    private final SelenideElement selectorMonth;
    private final SelenideElement selectorYear;

    public Calendar(String name,
                    SelenideElement selectorMonth, SelenideElement selectorYear,
                    SelenideElement selectorDay, SelenideElement selectorCalendar) {
        this.name = name;
        this.selectorCalendar = selectorCalendar;
        this.selectorDay = selectorDay;
        this.selectorMonth = selectorMonth;
        this.selectorYear = selectorYear;
    }
    public void setCalendar (String month, String year, String day) {
        selectorCalendar.click();

        selectorMonth.selectOption(month);

        selectorYear.selectOption(year);

        selectorDay.selectOption(day);
        selectorDay.click();
    }

}

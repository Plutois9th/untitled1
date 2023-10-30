package test;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import settings.Setp;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Test extends Setp {
    private final Calendar calendar = new Calendar("Practice Form", $(By.xpath("//DIV[@class='react-datepicker__day" +
            " react-datepicker__day--008'][text()='8']")), $(".react-datepicker__month-select"),
            $(".react-datepicker__year-select"), $("#dateOfBirthInput"));
@org.junit.jupiter.api.Test
    void openGoogle () {
    Selenide.open("https://demoqa.com/automation-practice-form");

    $("#firstName").setValue("Yuliya");
    $("#lastName").setValue("Shashkova");
    $("#userEmail").setValue("julia.rine55@mail.ru");
    $(By.xpath("//label[contains(text(),'Female')]")).click();
    $("#userNumber").setValue("9506149598");
    //Calendar
    $("#subjectsInput").setValue("Physics").pressEnter();;
    $(By.xpath("//label[contains(text(),'Sports')]")).click();
    $("#currentAddress").setValue("1 Apple Park Way. Cupertino, CA");
    $("#uploadPicture").uploadFile(new File(("src/test/resources/textFile.txt")));
    $(By.xpath("//div[contains(text(),'Select State')]")).click();
    //$(By.xpath("//div[contains(text(),'Select State')]")).selectOptionByValue("Uttar Pradesh");
    $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
    $("#react-select-4-input").setValue("Agra").pressEnter();
    $("#close-fixedban").click();//??? футтер перекрывает сабмит только при маленьком разрешении,
    // через кнопку убрать невозможно

    $("#submit").click(); //??? работает, только если позволяет разрешение экрана
    Selenide.sleep(2000);
    $("#closeLargeModal").click();

       Selenide.sleep(5000);


}
//    Select drpState = new Select($("#state"));
//drpState.deselectByVisibleText("Uttar Pradesh");
//public chooseDay(){
    //public Test setCalendar(String month, String year, String day) {
    // calendar.setCalendar(month, year, day);
    //return this;
}


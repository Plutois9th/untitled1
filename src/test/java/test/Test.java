package test;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import settings.Setp;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Test extends Setp {
    Data data = new Data();
    private final Calendar calendar = new Calendar("Привет",$(".react-datepicker__day.react-datepicker__day--019"),
            $(By.xpath("//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']//select[1]")),
            $(".react-datepicker__year-select"),
            $("#dateOfBirthInput"));
//    Calendar calendar = new Calendar ("Practice Form",
//            $(".react-datepicker__day.react-datepicker__day--019"),
//            $(By.xpath("//div[@class='react-datepickermonth-dropdown-container react-datepickermonth-dropdown-container--select']//select[1]")),
//            $(".react-datepicker__year-select"),
//            $("#dateOfBirthInput"));
@org.junit.jupiter.api.Test
    void openGoogle () {
    Selenide.open("https://demoqa.com/automation-practice-form");

    $("#firstName").setValue("Yuliya");
    $("#lastName").setValue("Shashkova");
    $("#userEmail").setValue("julia.rine55@mail.ru");
    $(By.xpath("//label[contains(text(),'Female')]")).click();
    $("#userNumber").setValue("9506149598");
    calendar.setCalendar(data.getMonth(), data.getYear(), data.getDay());
    $("#subjectsInput").setValue("Physics").pressEnter();
    $(By.xpath("//label[contains(text(),'Sports')]")).click();
    $("#currentAddress").setValue("1 Apple Park Way. Cupertino, CA");
    $("#uploadPicture").uploadFile(new File(("src/test/resources/textFile.txt")));
    $(By.xpath("//div[contains(text(),'Select State')]")).click();
    $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
    $("#react-select-4-input").setValue("Agra").pressEnter();
    //$("#close-fixedban").click();
    $("#submit").click();
    Selenide.sleep(2000);
    $("#closeLargeModal").click();

       Selenide.sleep(5000);



}

}


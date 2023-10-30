package test;

import Results.ResultFormPage;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import settings.Setp;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;



public class Test extends Setp {
    Data data = new Data();
    ResultFormPage resultFormPage = new ResultFormPage();
    private final Calendar calendar = new Calendar("Привет",
            $(".react-datepicker__month-select"),
            $(".react-datepicker__year-select"),
            $(".react-datepicker__day.react-datepicker__day--019"),
            $("#dateOfBirthInput"));

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
    Selenide.sleep(5000);

    resultFormPage.checkVisible()
            .checkResult("Student Name", "Yuliya" + " " + "Shashkova"
                    , "имя и фамилию")
            .checkResult("Student Email", "julia.rine55@mail.ru", "почту")
            .checkResult("Gender", "Female", "пол")
            .checkResult("Mobile", "9506149598", "номер телефона")
            .checkResult("Date of Birth", "19" + " " + "October" + ","
                    + "1994", "дату рождения")
            .checkResult("Subjects", "Physics", "предмет")
            .checkResult("Hobbies", "Sports", "хобби")
            .checkResult("Picture", "textFile.txt", "загруженный файл")
            .checkResult("Address", "1 Apple Park Way. Cupertino, CA", "адрес")
            .checkResult("State and City", "Uttar Pradesh" + " " + "Agra",
                    "штат и город");
}

}


package test;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class test {
@Test
    void openGoogle () {
    Selenide.open("https://demoqa.com/automation-practice-form");
    Selenide.sleep(60000);
    $("#firstName").setValue("Yuliya");
}
}

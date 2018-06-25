package com.fincue.ccloanAutomation.pages.ecash;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;
import static com.codeborne.selenide.Selenide.$;


public class Login {

    public static SelenideElement loginButton = $("[class*='login-button']");
    public static SelenideElement emailOrNumberField = $("[name*='email_or_number']");
    public static SelenideElement passwordField = $("[name*='password']");
    public static SelenideElement enterButton  = $("[class*='col-xs-12']");


    @Step
    public static void loginAs (String email, String password){
        loginButton.click();
        emailOrNumberField.setValue(email);
        passwordField.setValue(password);
        enterButton.click();

    }

        /* in future create assert method*/

}

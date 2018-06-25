package com.fincue.ccloanAutomation.pages.ecash;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.fincue.ccloanAutomation.pages.ecash.Login.loginButton;
import static com.fincue.ccloanAutomation.testdata.TestData.creditId;

public class UserInformation {
    public static String creditAmount1;
        public static SelenideElement userEmailField = $("div.info > ul > li:nth-child(2)");
        public static SelenideElement userPhoneField = $("div.info > ul > li:nth-child(4)");
        //User menu button
        public static SelenideElement newCreditButton = $("body > section > div > ul > li:nth-child(1) > a");
        public static SelenideElement creditHistoryButton = $("body > section > div > ul > li:nth-child(2) > a");
        public static SelenideElement userProfile = $("body > section > div > ul > li:nth-child(3) > a");
        //Password field
        public static SelenideElement userPassword = $("[name*='password']");
        public static SelenideElement newPassword = $("[name*='new_password']");
        public static SelenideElement repeatNewPassword = $("[name*='repeat_password']");
        public static SelenideElement updatePasswordButton = $("[class*='update-password']");
        public static SelenideElement alertSuccessPassword = $("[class*='alert-success']");
        //Credit History
        public static SelenideElement creditDetailsButton = $("div:nth-child(2) > div.link-container > a");
        public static SelenideElement creditIdInfo1 = $("div > div > h2");
        public static SelenideElement creditIdInfo2 = $("tbody > tr:nth-child(1) > th:nth-child(2)");
        public static SelenideElement creditAmount = $("div:nth-child(2) > div.balance > h1");
        public static SelenideElement creditAmountBalance = $("div > table > tbody > tr:nth-child(4) > td:nth-child(2)");





    @Step
    public static void assertLogin (String email,String phoneNumber){
        userEmailField.shouldHave(text(email));
        userPhoneField.shouldHave(text(phoneNumber));

    }

    @Step
    public static void changePassword(String password, String new_password ){
        userProfile.click();
        userPassword.setValue(password);
        newPassword.setValue(new_password);
        repeatNewPassword.setValue(new_password);
        updatePasswordButton.click();

    }
    @Step
    public static void assertChangePassword (String successPasswordAlert){
        alertSuccessPassword.shouldHave(text(successPasswordAlert));
    }
    @Step
    public static void backToOldPassword (String successPasswordAlert, String password, String old_password){
        userProfile.click();
        userPassword.setValue(password);
        newPassword.setValue(old_password);
        repeatNewPassword.setValue(old_password);
        updatePasswordButton.click();
        alertSuccessPassword.shouldHave(text(successPasswordAlert));

    }
    @Step
    public static void logoutAs (){
        loginButton.click();
    }
    @Step
    public static void assertCreditHistory(){
        creditHistoryButton.click();
        creditAmount1 = creditAmount.getText();
        creditDetailsButton.click();
        creditAmountBalance.shouldHave(text(creditAmount1));
        creditIdInfo1.shouldHave(text(creditId));
        //creditIdInfo1.shouldHave(text(creditIdInfo2.getText()));
    }



}

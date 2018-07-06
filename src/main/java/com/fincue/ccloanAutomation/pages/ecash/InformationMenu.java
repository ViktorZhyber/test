package com.fincue.ccloanAutomation.pages.ecash;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.fincue.ccloanAutomation.testdata.TestDataForGeneralInfo.*;


public class InformationMenu {

    //Selectors for navigation bar
    public static SelenideElement howToPayOff = $("li:nth-child(1) > a");
    public static SelenideElement howToTake = $("li:nth-child(2) > a");
    public static SelenideElement questionsAndAnswers = $("li:nth-child(3) > a");
    public static SelenideElement contacts = $("li:nth-child(4) > a");
    public static SelenideElement newss = $("li:nth-child(4) > a");


    //Selectors for How to Pay Off page
    public static SelenideElement paragraph1 = $("p:nth-child(5)");
    public static SelenideElement paragraph2 = $("p:nth-child(7)");
    public static SelenideElement paragraph3 = $("p:nth-child(9)");


    //Selectors for How to Take page
    public static SelenideElement howToTakeParagraph1 = $("div > p:nth-child(4)");
    public static SelenideElement howToTakeParagraph2 = $("div > p:nth-child(6)");
    public static SelenideElement howToTakeParagraph3 = $("div > p:nth-child(8)");
    public static SelenideElement howToTakeParagraph4 = $("div > p:nth-child(10)");
    public static SelenideElement howToTakeParagraph5 = $("div > p:nth-child(12)");

    //Selectors for Contacts page
    public static SelenideElement ContactsPhoneNumber1 = $("p:nth-child(3)");
    public static SelenideElement ContactsPhoneNumber2 = $("p:nth-child(4)");
    public static SelenideElement ContactsPhoneNumber3 = $("p:nth-child(5)");
    public static SelenideElement ContactsPhoneNumber4 = $("p:nth-child(6)");
    public static SelenideElement ContactsEmail = $("p:nth-child(9)");
    public static SelenideElement ContactsWorkHours = $("p:nth-child(12) > span");
    public static SelenideElement ContactsWorkHoursWeekend = $("p:nth-child(13) > span");
    public static SelenideElement ContactsAddress = $(" p:nth-child(16)");


    @Step
    public static void howToPayOffButtonMenu (){
        howToPayOff.click();
    }
    @Step
    public static void howToTakeButtonMenu (){
        howToTake.click();
    }

    @Step
    public static void questionsAndAnswersButtonMenu (){
        questionsAndAnswers.click();
    }

    @Step
    public static void contactsButtonMenu (){
        contacts.click();
    }
    @Step
    public static void newsButtonMenu (){
        newss.click();
    }

    @Step
    public static void assertHowToPayOff (){
        paragraph1.shouldHave(text(paragraf1));
        paragraph2.shouldHave(text(paragraf2));
        paragraph3.shouldHave(text(paragraf3));
    }

    @Step
    public static void assertHowToTake (){
        howToTakeParagraph1.shouldHave(text(howToTakeParagraf1));
        howToTakeParagraph2.shouldHave(text(howToTakeParagraf2));
        howToTakeParagraph3.shouldHave(text(howToTakeParagraf3));
        howToTakeParagraph4.shouldHave(text(howToTakeParagraf4));
        howToTakeParagraph5.shouldHave(text(howToTakeParagraf5));
    }

    @Step
    public static void assertContacts (){
        ContactsPhoneNumber1.shouldHave(text(contactsNumber1));
        ContactsPhoneNumber2.shouldHave(text(contactsNumber2));
        ContactsPhoneNumber3.shouldHave(text(contactsNumber3));
        ContactsPhoneNumber4.shouldHave(text(contactsNumber4));
        ContactsEmail.shouldHave(text(contactsEmail));
        ContactsWorkHours.shouldHave(text(contactsWorkHours));
        ContactsWorkHoursWeekend.shouldHave(text(contactsWorkHoursWeekend));
        ContactsAddress.shouldHave(text(contactsAddress));
    }





}

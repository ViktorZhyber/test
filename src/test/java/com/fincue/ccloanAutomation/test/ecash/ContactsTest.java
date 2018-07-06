package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.InformationMenu;
import com.fincue.ccloanAutomation.test.categories.EcashAcceptance;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.yandex.qatools.allure.annotations.Features;

public class ContactsTest extends BaseConfigurationTest {

    @Features( "Organization conact numbers")
    @Category(EcashAcceptance.class)
    @Test
    public void testContactsInfo(){

        //Step
        InformationMenu.contactsButtonMenu();
        InformationMenu.assertContacts();
    }
}

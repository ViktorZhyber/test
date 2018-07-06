package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.InformationMenu;
import org.junit.Test;

public class ContactsTest extends BaseConfigurationTest {

    @Test
    public void testContactsInfo(){

        //Step
        InformationMenu.contactsButtonMenu();
        InformationMenu.assertContacts();
    }
}

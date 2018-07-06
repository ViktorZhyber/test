package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.InformationMenu;
import org.junit.Test;

public class HowToPayOffTest extends BaseConfigurationTest {

    @Test
    public void testHowToPayOff (){

        //Step
        InformationMenu.howToPayOffButtonMenu();
        InformationMenu.assertHowToPayOff();
    }
}

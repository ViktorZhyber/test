package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.InformationMenu;
import org.junit.Test;

public class HowToTakeTest extends BaseConfigurationTest {

    @Test
    public void testHowToTake (){

        //Step
        InformationMenu.howToTakeButtonMenu();
        InformationMenu.assertHowToTake();
    }
}

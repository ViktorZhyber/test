package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.InformationMenu;
import com.fincue.ccloanAutomation.test.categories.EcashAcceptance;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.yandex.qatools.allure.annotations.Features;

public class HowToPayOffTest extends BaseConfigurationTest {

    @Features("Check information on the tow to pay off page")
    @Category(EcashAcceptance.class)
    @Test
    public void testHowToPayOff (){

        //Step
        InformationMenu.howToPayOffButtonMenu();
        InformationMenu.assertHowToPayOff();
    }
}

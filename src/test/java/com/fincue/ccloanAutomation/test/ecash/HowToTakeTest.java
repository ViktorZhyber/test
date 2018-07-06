package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.InformationMenu;
import com.fincue.ccloanAutomation.test.categories.EcashAcceptance;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.yandex.qatools.allure.annotations.Features;

public class HowToTakeTest extends BaseConfigurationTest {

    @Features("Check information on the How to take page ")
    @Category(EcashAcceptance.class)
    @Test
    public void testHowToTake (){

        //Step
        InformationMenu.howToTakeButtonMenu();
        InformationMenu.assertHowToTake();
    }
}

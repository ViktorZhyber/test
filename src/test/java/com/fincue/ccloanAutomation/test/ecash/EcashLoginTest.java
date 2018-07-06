package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.Login;
import com.fincue.ccloanAutomation.pages.ecash.UserInformation;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.yandex.qatools.allure.annotations.Features;

import static com.fincue.ccloanAutomation.testdata.TestData.*;

public class EcashLoginTest extends BaseConfigurationTest {

    @Features("Login to e-cash")
    @Category(EcashLoginTest.class)
    @Test
    public void testLogin(){
        //Step;
        Login.loginAs(email, password);
        UserInformation.assertLogin(email,phoneNumber);

    }
}

package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.Login;
import com.fincue.ccloanAutomation.pages.ecash.UserInformation;
import org.junit.Test;
import static com.fincue.ccloanAutomation.testdata.TestData.email;
import static com.fincue.ccloanAutomation.testdata.TestData.password;
import static com.fincue.ccloanAutomation.testdata.TestData.phoneNumber;

public class EcashLoginTest extends BaseConfigurationTest {

    @Test
    public void testLogin(){
        //Step;
        Login.loginAs(email, password);
        UserInformation.assertLogin(email,phoneNumber);

    }
}

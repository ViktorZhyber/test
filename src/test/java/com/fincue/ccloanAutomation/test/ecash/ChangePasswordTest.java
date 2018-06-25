package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.Login;
import com.fincue.ccloanAutomation.pages.ecash.UserInformation;
import org.junit.Test;

import static com.fincue.ccloanAutomation.testdata.TestData.*;

public class ChangePasswordTest extends BaseConfigurationTest {

    @Test
    public void testChangePassword (){
        Login.loginAs(email, password);
        UserInformation.assertLogin(email, phoneNumber);
        UserInformation.changePassword(password, newPassword);
        UserInformation.assertChangePassword(successPasswordAlert);
        UserInformation.logoutAs();
        Login.loginAs(email, newPassword);
        UserInformation.backToOldPassword(successPasswordAlert, newPassword, password);
    }
}

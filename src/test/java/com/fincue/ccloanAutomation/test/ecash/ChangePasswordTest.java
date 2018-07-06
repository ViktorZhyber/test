package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.Login;
import com.fincue.ccloanAutomation.pages.ecash.UserInformation;
import com.fincue.ccloanAutomation.test.categories.EcashAcceptance;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.yandex.qatools.allure.annotations.Features;

import static com.fincue.ccloanAutomation.testdata.TestData.*;

public class ChangePasswordTest extends BaseConfigurationTest {

    @Features("Change user password")
    @Category(EcashAcceptance.class)
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

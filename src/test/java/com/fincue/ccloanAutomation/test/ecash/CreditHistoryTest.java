package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.Login;
import com.fincue.ccloanAutomation.pages.ecash.UserInformation;
import org.junit.Test;

import static com.fincue.ccloanAutomation.pages.ecash.UserInformation.creditAmount1;
import static com.fincue.ccloanAutomation.pages.ecash.UserInformation.creditAmountBalance;
import static com.fincue.ccloanAutomation.testdata.TestData.email;
import static com.fincue.ccloanAutomation.testdata.TestData.password;
import static com.fincue.ccloanAutomation.testdata.TestData.phoneNumber;

public class CreditHistoryTest extends BaseConfigurationTest {

    @Test
    public void testCreditHistory (){
        Login.loginAs(email, password);
        UserInformation.assertLogin(email, phoneNumber);
        UserInformation.assertCreditHistory();
        System.out.println(creditAmount1);
        System.out.println(creditAmountBalance.getText());
    }

}

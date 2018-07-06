package com.fincue.ccloanAutomation.test.ecash;

import com.fincue.ccloanAutomation.core.BaseConfigurationTest;
import com.fincue.ccloanAutomation.pages.ecash.Login;
import com.fincue.ccloanAutomation.pages.ecash.UserInformation;
import com.fincue.ccloanAutomation.test.categories.EcashAcceptance;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.yandex.qatools.allure.annotations.Features;

import static com.fincue.ccloanAutomation.pages.ecash.UserInformation.creditAmount1;
import static com.fincue.ccloanAutomation.pages.ecash.UserInformation.creditAmountBalance;
import static com.fincue.ccloanAutomation.testdata.TestData.email;
import static com.fincue.ccloanAutomation.testdata.TestData.password;
import static com.fincue.ccloanAutomation.testdata.TestData.phoneNumber;

public class CreditHistoryTest extends BaseConfigurationTest {

    @Features("User credit history")
    @Category(EcashAcceptance.class)
    @Test
    public void testCreditHistory (){
        Login.loginAs(email, password);
        UserInformation.assertLogin(email, phoneNumber);
        UserInformation.assertCreditHistory();
        System.out.println(creditAmount1);
        System.out.println(creditAmountBalance.getText());
    }

}

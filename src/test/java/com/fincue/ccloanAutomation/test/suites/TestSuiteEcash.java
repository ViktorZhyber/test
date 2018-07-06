package com.fincue.ccloanAutomation.test.suites;

import com.fincue.ccloanAutomation.test.ecash.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EcashLoginTest.class,
        ChangePasswordTest.class,
        CreditHistoryTest.class,
        HowToPayOffTest.class,
        HowToTakeTest.class,
        ContactsTest.class
})
public class TestSuiteEcash {
}

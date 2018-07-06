package com.fincue.ccloanAutomation.test.suites;

import com.fincue.ccloanAutomation.test.categories.EcashAcceptance;
import com.fincue.ccloanAutomation.test.ecash.*;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        EcashLoginTest.class,
        ChangePasswordTest.class,
        CreditHistoryTest.class,
        HowToPayOffTest.class,
        HowToTakeTest.class,
        ContactsTest.class
})
@Categories.IncludeCategory(EcashAcceptance.class)
public class TestSuiteEcash {
}

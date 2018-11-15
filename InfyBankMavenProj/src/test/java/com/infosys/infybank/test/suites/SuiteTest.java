package com.infosys.infybank.test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.infosys.infybank.utilities.test.TestRandomPassword;
import com.infosys.infybank.utilities.test.TestUserProfile;

/**
 * The Class SuitrTest
 *
 */
@RunWith(Suite.class)
@SuiteClasses({TestRandomPassword.class,TestUserProfile.class})
public class SuiteTest {

}

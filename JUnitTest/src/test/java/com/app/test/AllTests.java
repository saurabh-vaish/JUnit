package com.app.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestArmstrongNumber.class, TestCaptchaGenerator.class, TestDbConnection.class,
		TestPalindromString.class, TestRandomNumber.class, TestMonkeyJump.class })
public class AllTests {

}

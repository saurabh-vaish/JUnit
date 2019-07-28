package com.app.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAssertMethods.class, TestBasic.class, TestEmployeeSingletonCheck.class })
public class AllTests {

}

package com.soebes.youtube.maven.episodes.ep4.suite1;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Demo - Suite One")
@SelectClasses({SuiteOneClass1SD1.class, SuiteOneClass2SD1.class})
class SuiteOne {

}

package com.soebes.youtube.maven.episodes.ep4;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Demo - First Suite")
@SelectPackages("com.soebes.youtube.maven.episodes.ep4.suite1")
@IncludeClassNamePatterns(".*SD")
class FirstSuite {

}

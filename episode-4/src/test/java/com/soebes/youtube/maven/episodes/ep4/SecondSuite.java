package com.soebes.youtube.maven.episodes.ep4;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Demo - Second Suite")
@SelectPackages("com.soebes.youtube.maven.episodes.ep4.suite2")
@IncludeClassNamePatterns(".*SD")
class SecondSuite {

}

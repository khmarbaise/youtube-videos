package com.soebes.youtube.maven.episodes.ep4.suite2;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Demo - Suite Two")
@SelectPackages("com.soebes.youtube.maven.episodes.ep4.suite2")
@IncludeClassNamePatterns(".*SD2")
class SuiteTwo {

}

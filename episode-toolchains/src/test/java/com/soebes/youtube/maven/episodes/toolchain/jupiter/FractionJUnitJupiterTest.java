package com.soebes.youtube.maven.episodes.toolchain.jupiter;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.assertj.core.api.Assertions.assertThat;

import com.soebes.youtube.maven.episodes.toolchain.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class FractionJUnitJupiterTest {

  @BeforeEach
  void beforeEach() {
    String javaVendor = System.getProperty("java.vendor");
    System.out.println("javaVendor = " + javaVendor);
  }

  @Test
  @EnabledOnJre(JRE.JAVA_8)
  void enabled_jre8() {
    System.out.println("FractionJUnitJupiterTest.enabled_jre8");
    Fraction sum1 = new Fraction(5);
    Fraction sum2 = new Fraction(2);

    assertThat(sum1.add(sum2)).isEqualTo(new Fraction(7));
  }

  @Test
  @EnabledOnJre(JRE.JAVA_11)
  void enabled_jre11() {
    System.out.println("FractionJUnitJupiterTest.enabled_jre11");
    Fraction sum1 = new Fraction(5);
    Fraction sum2 = new Fraction(2);

    assertThat(sum1.add(sum2)).isEqualTo(new Fraction(7));
  }

  @Test
  @EnabledOnJre(JRE.JAVA_17)
  void enabled_jre17() {
    System.out.println("FractionJUnitJupiterTest.enabled_jre17");
    Fraction sum1 = new Fraction(5);
    Fraction sum2 = new Fraction(2);

    assertThat(sum1.add(sum2)).isEqualTo(new Fraction(7));
  }


}

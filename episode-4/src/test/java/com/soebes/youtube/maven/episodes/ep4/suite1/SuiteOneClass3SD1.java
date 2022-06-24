package com.soebes.youtube.maven.episodes.ep4.suite1;

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

import com.soebes.youtube.maven.episodes.ep4.Fraction;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SuiteOneClass3SD1 {

  @Test
  void first_add() {
    System.out.println("SuiteOneClass3SD1.first_add");
    Fraction sum1 = new Fraction(5);
    Fraction sum2 = new Fraction(2);

    assertThat(sum1.add(sum2)).isEqualTo(new Fraction(7));
  }

  @Test
  void second_add() {
    System.out.println("SuiteOneClass3SD1.second_add");
    Fraction sum1 = new Fraction(10);
    Fraction sum2 = new Fraction(2);

    assertThat(sum1.add(sum2)).isEqualTo(new Fraction(12));
  }

}

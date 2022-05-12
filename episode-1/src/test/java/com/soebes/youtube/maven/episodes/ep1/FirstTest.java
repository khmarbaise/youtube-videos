package com.soebes.youtube.maven.episodes.ep1;

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
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FirstTest {

  @Test
  void first_add() {
    First sum1 = new First(5);
    First sum2 = new First(2);

    assertThat(sum1.add(sum2)).isEqualTo(new First(7));
  }

  static Stream<Arguments> parameterized() {
    return Stream.of(
        of(new First(1), new First(2), new First(3)),
        of(new First(2), new First(3), new First(5))
    );
  }
  @ParameterizedTest
  @MethodSource
  void parameterized(First sum1, First sum2, First result) {
    assertThat(sum1.add(sum2)).isEqualTo(result);
  }
}

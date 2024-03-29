/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.logging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.google.cloud.logging.Logging.ListOption;
import com.google.cloud.logging.Option.OptionType;
import com.google.common.testing.EqualsTester;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class OptionTest {

  private static final OptionType OPTION_TYPE = ListOption.OptionType.PAGE_SIZE;
  private static final OptionType ANOTHER_OPTION_TYPE = ListOption.OptionType.PAGE_TOKEN;
  private static final String VALUE = "some value";
  private static final String OTHER_VALUE = "another value";
  private static final Option OPTION = new Option(OPTION_TYPE, VALUE) {};
  private static final Option OPTION_EQUALS = new Option(OPTION_TYPE, VALUE) {};
  private static final Option OPTION_NOT_EQUALS1 = new Option(ANOTHER_OPTION_TYPE, OTHER_VALUE) {};
  private static final Option OPTION_NOT_EQUALS2 = new Option(ANOTHER_OPTION_TYPE, VALUE) {};

  @Test
  public void testEquals() {
    new EqualsTester()
        .addEqualityGroup(OPTION, OPTION_EQUALS)
        .addEqualityGroup(OPTION_NOT_EQUALS1)
        .addEqualityGroup(OPTION_NOT_EQUALS2)
        .testEquals();
  }

  @Test
  public void testConstructor() {
    assertEquals(OPTION_TYPE, OPTION.getOptionType());
    assertEquals(VALUE, OPTION.getValue());
    Option option = new Option(OPTION_TYPE, null) {};
    assertEquals(OPTION_TYPE, option.getOptionType());
    assertNull(option.getValue());
    try {
      new Option(null, VALUE) {};
      Assert.fail();
    } catch (NullPointerException expected) {

    }
  }

  @Test
  public void testListOption() {
    Option option = ListOption.pageSize(42);
    assertEquals(ListOption.OptionType.PAGE_SIZE, option.getOptionType());
    assertEquals(42, option.getValue());
    option = ListOption.pageToken("cursor");
    assertEquals(ListOption.OptionType.PAGE_TOKEN, option.getOptionType());
    assertEquals("cursor", option.getValue());
  }
}

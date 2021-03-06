/**
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.tools.npm.version;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SimpleConditionTest {
    @Test
    public void testSatisfies() throws Exception {
        assertTrue(new SimpleCondition(null, "1").satisfies("1.0.0"));
        assertTrue(new SimpleCondition("~", "3.0.0rc4").satisfies("3.0.0rc4"));

    }
}

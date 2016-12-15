/*
 * Copyright (c) 2016 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
/**
 *
 */
package school.syntactic.languages.nx;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ary
 *
 */
public class RecTest {

    @Test
    public void baseTest() {
        Rec r = new Rec(0);
        Assert.assertEquals(1, Integer.parseInt(r.calculate().toString()));

        r = new Rec(1);
        Assert.assertEquals(2, Integer.parseInt(r.calculate().toString()));

        r = new Rec(2);
        Assert.assertEquals(4, Integer.parseInt(r.calculate().toString()));

        r = new Rec(10);
        Assert.assertEquals(1024, Integer.parseInt(r.calculate().toString()));
    }
}

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
package school.syntactic.languages.sqrtn;

/**
 * @author ary
 *
 */
public class RecSqer {

    private final double precision;
    private final int num;

    /**
     * @param input
     * @param num
     */
    public RecSqer(final int input, final int num) {
        this.num = num;
        this.precision = 1.0 / (Math.pow(10, input));
        System.out.println("Your precision is " + this.precision);
    }

    /**
     *
     */
    public double calculate() {
        return recur(1);
    }

    /**
     * @param x
     */
    private double recur(final double x) {
        final double x1 = 0.5 * (x + (this.num / x));
        if (Math.abs(x1 - x) < this.precision) {
            return x1;
        } else {
            return recur(x1);
        }
    }

}

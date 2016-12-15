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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ary
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) throws NumberFormatException, IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digit (number - Integer): ");
        final int digit = Integer.parseInt(br.readLine());
        System.out.print("The number (number - Integer): ");
        final int num = Integer.parseInt(br.readLine());

        final RecSqer sqrt = new RecSqer(digit, num);
        final String result = String.valueOf(sqrt.calculate());
        final StringBuilder strB = new StringBuilder();
        strB.append(result.substring(0, result.indexOf('.')));
        strB.append(result.substring(result.indexOf('.'), (result.indexOf('.') + digit + 1)));
        System.out.println("Result = " + strB.toString());
    }

}

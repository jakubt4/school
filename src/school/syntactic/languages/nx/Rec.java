package school.syntactic.languages.nx;

import java.math.BigInteger;

public class Rec {

    private final long input;
    private final BigInteger two = new BigInteger("2");
    private BigInteger bigInt;

    public Rec(final int input) {
        this.input = input;
        this.bigInt = new BigInteger("1");
    }

    public void calculate() {
        prepareRecurzion(0);
        System.out.println(this.bigInt.toString());
    }

    private void prepareRecurzion(int i) {
        if (i < this.input) {
            this.bigInt = this.bigInt.multiply(this.two);
            prepareRecurzion(++i);
        }
    }

}

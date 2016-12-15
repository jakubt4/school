package school.syntactic.languages.nx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input (number - Integer): ");
        final int input = Integer.parseInt(br.readLine());
        final Rec rek = new Rec(input);
        rek.calculate();
    }

}

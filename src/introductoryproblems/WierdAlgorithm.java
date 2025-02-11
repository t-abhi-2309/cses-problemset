package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WierdAlgorithm {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = READER.readLine();
        long n = Long.parseLong(input, 10);
        StringBuilder builder = new StringBuilder();
        builder.append(n);
        while (n > 1) {
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            builder.append(" ");
            builder.append(n);
        }

        System.out.print(builder.toString());
    }
}

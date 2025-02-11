package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int n = Integer.parseInt(line, 10);
        int result = 0;
        int denominator = 5;
        while ((n / denominator) > 0) {
            result += (n / denominator);
            denominator *= 5;
        }
        System.out.println(result);
    }
}

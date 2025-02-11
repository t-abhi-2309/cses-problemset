package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MissingNumber {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line1 = READER.readLine();
        int n = Integer.parseInt(line1, 10);
        String line2 = READER.readLine();
        String[] numerals = line2.split(" ");
        int[] digits = Arrays.stream(numerals).mapToInt(Integer::parseInt).toArray();
        int xor1 = 0;
        int xor2 = 0;
        for (int index = 0; index < digits.length; index++) {
            xor1 = xor1 ^ (index + 1);
            xor2 = xor2 ^ digits[index];
        }
        xor1 = xor1 ^ n;
        System.out.println(xor1 ^ xor2);
    }
}

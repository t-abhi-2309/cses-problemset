package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GrayCode {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int[] decimalToBinary(int num, int length) {
        int[] decimal = new int[length];
        int index = length - 1;
        while (num > 0) {
            decimal[index] = num % 2;
            index--;
            num = num / 2;
        }
        return decimal;
    }

    private static int[] binaryToGrayCode(int[] decimal) {
        int[] grayCode = new int[decimal.length];
        grayCode[0] = decimal[0];
        for (int index = 1; index < decimal.length; index++) {
            grayCode[index] = decimal[index] ^ decimal[index - 1];
        }
        return grayCode;
    }

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int n = Integer.parseInt(line, 10);
        int powerOf2 = 1 << n;
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < powerOf2; index++) {
            int[] decimal = decimalToBinary(index, n);
            int[] grayCode = binaryToGrayCode(decimal);
            String code = Arrays.stream(grayCode).mapToObj(String::valueOf).collect(Collectors.joining());
            builder.append(code);
            builder.append("\n");
        }
        System.out.println(builder);
    }
}

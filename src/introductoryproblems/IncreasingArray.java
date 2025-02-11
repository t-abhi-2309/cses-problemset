package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IncreasingArray {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line1 = READER.readLine();
        int n = Integer.parseInt(line1);
        String line2 = READER.readLine();
        String[] tokens = line2.split(" ");
        long[] arr = Arrays.stream(tokens).mapToLong(Long::parseLong).toArray();
        long prev = arr[0];
        long moves = 0;
        for (int index = 1; index < n; index++) {
            if (prev > arr[index]) {
                moves += prev - arr[index];
            } else {
                prev = arr[index];
            }
        }
        System.out.println(moves);
    }
}

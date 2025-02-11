package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PalindromeReorder {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = READER.readLine();
        int n = str.length();
        char[] arr = new char[n];

        Map<Character, Integer> charFreq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }

        int noOfOdds = 0;
        int index = 0;
        boolean isNEven = n % 2 == 0;
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            if (freq % 2 == 1) {
                noOfOdds++;
                arr[n / 2] = ch;
            }
            if (noOfOdds > 1 || (isNEven && noOfOdds > 0)) {
                System.out.println("NO SOLUTION");
                System.exit(0);
            }
            if (freq > 1) {
                for (int ptr = index; ptr < (index + freq / 2); ptr++) {
                    arr[ptr] = ch;
                    arr[n - 1 - ptr] = ch;
                }
                index += freq / 2;
            }
        }

        System.out.println(new String(arr));
    }
}

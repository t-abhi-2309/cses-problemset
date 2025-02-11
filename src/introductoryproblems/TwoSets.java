package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoSets {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int n = Integer.parseInt(line);

        long sum = ((long) n * ((long) n + 1)) / 2;
        if (sum % 2 == 1) {
            System.out.println("NO");
            System.exit(0);
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        long mid = sum / 2;
        while (mid > 0) {
            if (n <= mid) {
                set1.add(n);
                mid -= n;
            } else {
                set2.add(n);
            }
            n--;
        }

        while (n > 0) {
            set2.add(n);
            n--;
        }

        System.out.println("YES");
        System.out.println(set1.size());
        System.out.println(set1.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println(set2.size());
        System.out.println(set2.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

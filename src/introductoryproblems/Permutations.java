package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int n = Integer.parseInt(line, 10);

        switch (n) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("NO SOLUTION");
                break;
            case 3:
                System.out.println("NO SOLUTION");
                break;
            default:
                solve(n);
        }
    }

    private static void solve(int n) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int o = 1; o <= n; o += 2) {
            odd.append(o).append(" ");
        }

        for (int e = 2; e <= n; e += 2) {
            even.append(e).append(" ");
        }

        if (n % 2 == 0) {
            even.append(odd.toString().trim());
            System.out.println(even.toString());
        } else {
            odd.append(even.toString().trim());
            System.out.println(odd.toString());
        }
    }
}

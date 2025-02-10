import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinPiles {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int t = Integer.parseInt(line, 10);
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < t; index++) {
            line = READER.readLine();
            String[] tokens = line.split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);

            /**
             * The two equations formed are:
             * 1.) a = 2x + y
             * 2.) b = x + 2y
             *
             * Solving these we get i.e. by multiplying eq 1 by 2 and then subtracting eq 1 and eq 2
             * x = (2a - b)/3
             * y = (2b - a)/3
             *
             * Therefore, if both Numerators are >=0 and divisible by 3 only then
             * it's possible to empty both the piles.
             */

            int nr1 = 2 * a - b;
            int nr2 = 2 * b - a;

            if (nr1 >= 0 && nr2 >= 0 && nr1 % 3 == 0 && nr2 % 3 == 0) {
                builder.append("YES");
            } else {
                builder.append("NO");
            }
            if (index < t - 1) {
                builder.append("\n");
            }
        }
        System.out.println(builder.toString());
    }
}

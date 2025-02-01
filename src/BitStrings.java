import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitStrings {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int n = Integer.parseInt(line, 10);
        int result = 1;
        for (int index = 0; index < n; index++) {
            result = (result << 1) % MOD;
        }
        System.out.println(result);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int maxCount = 1;
        int count = 1;
        char previousChar = line.charAt(0);
        for (int index = 1; index < line.length(); index++) {
            char ch = line.charAt(index);
            if (previousChar == ch) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
            previousChar = ch;
        }
        System.out.println(maxCount);
    }
}

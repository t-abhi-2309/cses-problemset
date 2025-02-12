package introductoryproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerOfHanoi {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = READER.readLine();
        int n = Integer.parseInt(line, 10);
        StringBuilder builder = new StringBuilder();
        builder.append((1 << n )- 1);
        builder.append("\n");
        towerOfHanoi(n, 1, 2, 3, builder);
        System.out.println(builder);
    }

    private static void towerOfHanoi(int disks, int source, int helper, int destination, StringBuilder builder) {
        if(disks > 0) {
            towerOfHanoi(disks - 1, source, destination, helper, builder);
            builder.append(source).append(" ").append(destination).append("\n");
            towerOfHanoi(disks - 1, helper, source, destination , builder);
        }
    }
}

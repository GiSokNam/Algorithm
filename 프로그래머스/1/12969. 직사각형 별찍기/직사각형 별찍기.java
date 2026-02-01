import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split(" ");

        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        StringBuilder rowBuilder = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            rowBuilder.append('*');
        }

        String row = rowBuilder.toString();

        StringBuilder resultBuilder = new StringBuilder((n + 1) * m);
        for (int i = 0; i < m; i++) {
            resultBuilder.append(row).append('\n');
        }

        System.out.print(resultBuilder);
    }
}
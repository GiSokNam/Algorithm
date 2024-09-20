import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] desc = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            desc[i] = Integer.parseInt(br.readLine());
            sum += desc[i];
        }
        br.close();

        int avg = sum / 5;
        Arrays.sort(desc);

        sb.append(avg + "\n" + desc[2]);
        System.out.print(sb);
    }
}
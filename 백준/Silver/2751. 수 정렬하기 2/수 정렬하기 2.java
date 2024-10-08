import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] desc = new int[N];

        for (int i = 0; i < N; i++) {
            desc[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(desc);

        for (int i : desc) {
            sb.append(i + "\n");
        }
        System.out.print(sb);
    }
}
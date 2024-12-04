import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(time);

        int prev = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += prev + time[i];
            prev += time[i];
        }

        sb.append(sum);
        System.out.print(sb);
    }
}
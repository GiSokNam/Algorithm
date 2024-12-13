import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        br.close();

        long min = 1;
        long max = K;

        while (min < max) {
            long mid = (min + max) / 2;
            long sum = 0;

            for (int i = 1; i <= N; i++) {
                sum += Math.min(mid / i, N);
            }

            if (K <= sum) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        sb.append(min);
        System.out.print(sb);
    }

}
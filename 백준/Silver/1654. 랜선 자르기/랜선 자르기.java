import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long max = 0;
        int[] line = new int[K];

        for (int i = 0; i < K; i++) {
            line[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, line[i]);
        }

        long result = binarySearch(line, N, ++max);

        br.close();
        bw.write(result + "");
        bw.flush();
        bw.close();
    }

    static long binarySearch(int[] line, int n, long max) {
        long left = 0;

        while (left < max) {
            long mid = (left + max) / 2;
            long totalLine = 0;

            for (int i : line) {
                totalLine += i / mid;
            }

            if (totalLine < n) {
                max = mid;
            } else {
                left = mid + 1;
            }
        }

        return left - 1;
    }
}
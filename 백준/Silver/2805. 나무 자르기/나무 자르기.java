import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] trees;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        trees = new int[N];
        long max = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        long result = binarySearch(0, max);
        br.close();
        sb.append(result);
        System.out.print(sb);
    }

    static long binarySearch(long min, long max) {
        if (min > max) {
            return max;
        }

        long mid = (min + max) / 2;
        long sum = cutting(mid);

        if (sum < M) {
            return binarySearch(min, mid - 1);
        } else {
            return binarySearch(mid + 1, max);
        }
    }

    static long cutting(long mid) {
        long sum = 0;
        for (int tree : trees) {
            if (tree > mid) {
                sum += (tree - mid);
            }
        }
        return sum;
    }
}
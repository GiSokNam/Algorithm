import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static Integer[] result;
    static int max;

    static int cul(int N) {
        if (result[N] == null) {
            result[N] = Math.max(cul(N - 1) + arr[N], arr[N]);
            max = Math.max(result[N], max);
        }

        return result[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        result = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        result[0] = arr[0];
        max = arr[0];
        cul(N - 1);
        br.close();
        sb.append(max);
        System.out.print(sb);
    }
}
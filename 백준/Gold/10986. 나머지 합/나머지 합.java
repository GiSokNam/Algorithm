import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] arr = new long[N + 1];
        long result = 0;
        long[] cnt = new long[M];
        arr[0] = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = (arr[i - 1] + Integer.parseInt(st.nextToken())) % M;
            if(arr[i] == 0) result++;
            cnt[(int) arr[i]]++;
        }

        for (int i = 0; i < M; i++) {
            if(cnt[i] > 1) result += (cnt[i] * (cnt[i] - 1) / 2);
        }

        br.close();
        sb.append(result);
        System.out.print(sb);
    }
}
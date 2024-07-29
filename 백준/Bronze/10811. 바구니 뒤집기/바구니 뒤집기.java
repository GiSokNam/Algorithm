import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        int I;
        int J;
        int temp = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            I = Integer.parseInt(st.nextToken()) -1;
            J = Integer.parseInt(st.nextToken()) -1;

            while (I < J) {
                temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }
        br.close();
        for (int i : arr) {
            sb.append(i + " ");
        }
        System.out.print(sb);
    }
}
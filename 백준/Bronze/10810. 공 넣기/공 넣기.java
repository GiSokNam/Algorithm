import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        br.close();
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
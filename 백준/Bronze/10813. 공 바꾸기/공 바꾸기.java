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

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int temp = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            temp = arr[I -1];
            arr[I -1] = arr[J -1];
            arr[J -1] = temp;
        }
        br.close();
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
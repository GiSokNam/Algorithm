import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if(min > a[i]) min = a[i];
            if(max < a[i]) max = a[i];
        }
        bw.write(min + " "+ max);
        bw.flush();
        bw.close();
    }
}
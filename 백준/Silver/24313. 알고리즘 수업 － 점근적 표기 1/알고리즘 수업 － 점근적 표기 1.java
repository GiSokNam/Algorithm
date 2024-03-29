import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        br.close();
        int fn = a1 * n0 + a0;
        int cg = c * n0;
        if (fn <= cg && a1 <= c) {
            bw.write(1 + "");
        } else {
            bw.write(0 + "");
        }
        bw.flush();
        bw.close();
    }
}
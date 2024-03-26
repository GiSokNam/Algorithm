import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int E = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        br.close();
        int x;
        int y;

        if (A == C) {
            x = E;
        } else if (A == E) {
            x = C;
        } else{
            x = A;
        }

        if (B == D) {
            y = F;
        } else if (B == F) {
            y = D;
        } else {
            y = B;
        }

        bw.write(x + " " +y);
        bw.flush();
        bw.close();
    }
}
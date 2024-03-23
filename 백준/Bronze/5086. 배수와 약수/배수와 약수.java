import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a;
        int b;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a < b) {
                if (b % a == 0) {
                    bw.write("factor");
                    bw.newLine();
                } else {
                    bw.write("neither");
                    bw.newLine();
                }
            } else if(a > b) {
                if (a % b == 0) {
                    bw.write("multiple");
                    bw.newLine();
                } else {
                    bw.write("neither");
                    bw.newLine();
                }
            } else if (a == 0 && b == 0) {
                break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
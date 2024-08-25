import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a;
        int b;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a < b) {
                if (b % a == 0) {
                    sb.append("factor" + "\n");
                } else {
                    sb.append("neither" + "\n");
                }
            } else if(a > b) {
                if (a % b == 0) {
                    sb.append("multiple" + "\n");
                } else {
                    sb.append("neither" + "\n");
                }
            } else if (a == 0 && b == 0) {
                break;
            }
        }
        br.close();
        System.out.print(sb);
    }
}
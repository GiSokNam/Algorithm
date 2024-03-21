import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        br.close();

        int result = 0;
        int idx = 0;
        int num = 0;
        char c;
        for (int i = N.length() - 1; i >= 0; i--) {
            c = N.charAt(i);
            if ('0' <= c && c <= '9') {
                num = c - '0';
            } else {
                num = c - 55;
            }
            result += num * Math.pow(B, idx++);
        }
        System.out.println(result);
    }
}
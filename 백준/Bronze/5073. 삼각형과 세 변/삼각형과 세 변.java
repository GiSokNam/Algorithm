import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a;
        int b;
        int c;
        int sum;
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            sum = a + b + c;
            if(sum == 0) break;

            int[] d = new int[]{a, b, c};
            Arrays.sort(d);

            if (d[2] >= d[0] + d[1]) {
                sb.append("Invalid");
            } else {
                if (a == b && b == c) {
                    sb.append("Equilateral");
                }
                if ((a == b && b != c) || (a != b && b == c) || (a == c && b != c)) {
                    sb.append("Isosceles");
                }
                if (a != b && b != c && a != c) {
                    sb.append("Scalene");
                }
            }
            sb.append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] t = new int[] {a, b, c};
        br.close();
        Arrays.sort(t);
        int sum;
        if (t[2] >= t[1] + t[0]) {
            sum = (t[1] + t[0] - 1) + t[1] + t[0] ;
        } else {
            sum = t[2] + t[1] + t[0];
        }
        System.out.print(sum);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long x = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Long sum = 0L;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += a*b;
        }
        br.close();

        if (sum.equals(x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
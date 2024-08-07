import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] check = new int[] {1,1,2,2,2,8};
        int[] input = new int[6];
        for (int i = 0; i < check.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            check[i] = check[i] - input[i];
        }
        for (int i : check) {
            sb.append(i + " ");
        }
        System.out.print(sb);
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        br.close();
        int spot = (int) Math.pow(Math.pow(2, N) + 1, 2);
        sb.append(spot);
        System.out.print(sb);
    }
}
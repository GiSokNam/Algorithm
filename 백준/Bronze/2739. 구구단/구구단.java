import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < 10; i++) {
            sb.append(n + " * " + i + " = " + (n * i) + "\n");
        }
        System.out.println(sb);
    }
}
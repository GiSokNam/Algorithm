import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Long n = Long.parseLong(br.readLine());
        Long time = (n * (n - 1) * (n - 2)) / 6;
        br.close();
        sb.append(time + "\n" + 3);
        System.out.print(sb);
    }
}
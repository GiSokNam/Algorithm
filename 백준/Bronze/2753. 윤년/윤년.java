import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Long a = Long.parseLong(br.readLine());
        br.close();

        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) sb.append("1");
        else sb.append("0");
        System.out.print(sb);
    }
}
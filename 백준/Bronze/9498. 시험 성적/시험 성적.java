import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Long a = Long.parseLong(br.readLine());

        if (a >= 90) {
            sb.append("A");
        } else if (a >= 80) {
            sb.append("B");
        } else if (a >= 70) {
            sb.append("C");
        } else if (a >= 60) {
            sb.append("D");
        } else {
            sb.append("F");
        }
        System.out.print(sb);
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());

        br.close();

        if (a > b) {
            sb.append(">");
        } else if (a.equals(b)) {
            sb.append("==");
        } else {
            sb.append("<");
        }
        System.out.println(sb);
    }
}
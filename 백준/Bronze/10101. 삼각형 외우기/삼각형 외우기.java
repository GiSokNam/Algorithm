import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        int sum = a + b + c;
        if (sum == 180) {
            if (a == b && b == c) {
                sb.append("Equilateral");
            }
            if ((a == b && b != c) || (a != b && b == c) || (a == c && b != c)) {
                sb.append("Isosceles");
            }
            if (a != b && b != c && a != c) {
                sb.append("Scalene");
            }
        } else {
            sb.append("Error");
        }

        System.out.println(sb);
    }
}
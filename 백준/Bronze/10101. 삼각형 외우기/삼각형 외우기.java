import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();

        int sum = a + b + c;
        if (sum == 180) {
            if (a == b && b == c) {
                bw.write("Equilateral");
            }
            if ((a == b && b != c) || (a != b && b == c) || (a == c && b != c)) {
                bw.write("Isosceles");
            }
            if (a != b && b != c && a != c) {
                bw.write("Scalene");
            }
        } else {
            bw.write("Error");
        }
        bw.flush();
        bw.close();
    }
}
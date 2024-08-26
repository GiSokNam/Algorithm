import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum;
        int n;
        String result = "";
        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }
            sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (i == 1) {
                        result = (n + " = " + i);
                    } else {
                        result += (" + " + i);
                    }
                }
            }

            if (n != sum) {
                result = n + " is NOT perfect.";
            }
            sb.append(result + "\n");
        }
        br.close();
        System.out.print(sb);
    }
}
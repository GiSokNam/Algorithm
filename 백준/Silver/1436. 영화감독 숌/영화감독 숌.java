import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        br.close();

        int checkNum = 666;
        int count = 1;

        while (count != N) {
            checkNum++;
            if (String.valueOf(checkNum).contains("666")) {
                count++;
            }
        }
        sb.append(checkNum);
        System.out.print(sb);
    }
}
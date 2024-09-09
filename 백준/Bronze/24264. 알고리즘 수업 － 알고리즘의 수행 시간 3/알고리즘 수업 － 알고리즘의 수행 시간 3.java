import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        Long time = n * n;
        br.close();
        System.out.println(time);
        System.out.print(2);
    }
}
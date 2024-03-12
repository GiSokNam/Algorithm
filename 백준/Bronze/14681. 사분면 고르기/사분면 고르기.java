import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long x = Long.parseLong(br.readLine());
        Long y = Long.parseLong(br.readLine());
        if (x > 0) {
            if (y > 0) System.out.println("1");
            else System.out.println("4");
        }
        if (x < 0) {
            if (y > 0) System.out.println("2");
            else System.out.println("3");
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str;
        int count = 0;

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            if (check(str)) {
                count++;
            }
        }
        br.close();
        System.out.print(count);

    }

    static boolean check(String str) {
        boolean[] check = new boolean[26];
        int pre = 0;
        int now = 0;

        for (int i = 0; i < str.length(); i++) {
            now = str.charAt(i);
            if (pre != now) {
                if (!check[now - 97]) {
                    check[now - 97] = true;
                    pre = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
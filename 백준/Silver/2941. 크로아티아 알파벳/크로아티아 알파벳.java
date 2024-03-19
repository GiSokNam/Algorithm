import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alpa = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        br.close();
        for (int i = 0; i < alpa.length; i++) {
            if (str.contains(alpa[i])) {
                str = str.replace(alpa[i], "*");
            }
        }
        System.out.println(str.length());

    }
}
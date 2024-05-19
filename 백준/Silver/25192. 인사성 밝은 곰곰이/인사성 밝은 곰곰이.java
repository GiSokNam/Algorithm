import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        String str;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            if (str.equals("ENTER")) {
                set.clear();
            } else {
                if(set.contains(str)) continue;
                set.add(str);
                cnt++;
            }
        }

        br.close();
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
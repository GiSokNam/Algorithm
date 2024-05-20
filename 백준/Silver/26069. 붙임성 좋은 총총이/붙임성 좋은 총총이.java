import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String person1 = st.nextToken();
            String person2 = st.nextToken();

            if (set.contains(person1) || set.contains(person2)) {
                set.add(person1);
                set.add(person2);
            }

        }

        br.close();
        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}
import java.io.*;

public class Main {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            cnt = 0;
            int palindrome = isPalindrome(br.readLine());
            bw.write(palindrome + " " + cnt) ;
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static int recursion(String s, int l, int r) {
        cnt++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }
    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }
}
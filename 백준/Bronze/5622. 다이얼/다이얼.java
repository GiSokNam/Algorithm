import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine();
        br.close();
        int sum = 0;
        for (int i = 0; i < T.length(); i++) {
            switch (T.charAt(i)) {
                case 'Z':
                case 'Y':
                case 'X':
                case 'W': sum += 10;
                    break;
                case 'V':
                case 'U':
                case 'T': sum += 9;
                    break;
                case 'S':
                case 'R':
                case 'Q':
                case 'P': sum += 8;
                    break;
                case 'O':
                case 'N':
                case 'M': sum += 7;
                    break;
                case 'L':
                case 'K':
                case 'J': sum += 6;
                    break;
                case 'I':
                case 'H':
                case 'G': sum += 5;
                    break;
                case 'F':
                case 'E':
                case 'D': sum += 4;
                    break;
                case 'C':
                case 'B':
                case 'A': sum += 3;
                    break;
            }
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
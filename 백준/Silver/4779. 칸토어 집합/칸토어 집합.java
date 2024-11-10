import java.io.*;
import java.util.Arrays;

public class Main {

    static char[] lineArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        int N;

        while ((str = br.readLine()) != null) {
            N = Integer.parseInt(str);

            int len = (int) Math.pow(3, N);

            lineArr = new char[len];
            Arrays.fill(lineArr, '-');

            divide(0, len);

            for (int i = 0; i < lineArr.length; i++) {
                sb.append(lineArr[i]);
            }
            sb.append("\n");
        }
        br.close();
        System.out.print(sb);
    }

    static void divide(int start, int length) {

        if(length <= 1){
            return;
        }

        int newlength = length/3;
        for(int i = start+newlength; i < start+newlength*2; i++){
            lineArr[i] = ' ';
        }

        divide(start, newlength);
        divide(start+newlength*2, newlength);
    }

}
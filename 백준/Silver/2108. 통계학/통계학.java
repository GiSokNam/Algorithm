import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[] numbers = new long[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        double sum = 0;
        for (long number : numbers) {
            sum += number;
        }

        long avg = Math.round(sum / N);
        Arrays.sort(numbers);
        long mid = numbers[numbers.length / 2];


        long cnt = 0;
        long max = -1;
        long frequency = numbers[0];
        boolean check = false;
        for (int i = 0; i < N -1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (max < cnt) {
                max = cnt;
                frequency = numbers[i];
                check = true;
            } else if (max == cnt && check == true) {
                frequency = numbers[i];
                check = false;
            }
        }

        long differ = Math.abs(numbers[numbers.length - 1] - numbers[0]);

        bw.write(avg + "");
        bw.newLine();
        bw.write(mid + "");
        bw.newLine();
        bw.write(frequency + "");
        bw.newLine();
        bw.write(differ + "");;
        bw.flush();
        bw.close();
    }
}
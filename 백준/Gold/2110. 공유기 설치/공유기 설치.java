import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] house;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        house = new int[N];

        for (int i = 0; i < N; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(house);

        int min = 1;
        int max = house[N - 1] - house[0] + 1;

        while (min < max) {
            int mid = (min + max) / 2;

            if (installWifi(mid) < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        int result = min - 1;
        sb.append(result);
        System.out.print(sb);
    }

    static int installWifi(int distance) {
        int count = 1;
        int lastLocate = house[0];

        for (int i = 1; i < house.length; i++) {
            int locate = house[i];

            if (locate - lastLocate >= distance) {
                count++;
                lastLocate = locate;
            }
        }
        return count;
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] temp;
    static int count = 0;
    static int K;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        temp = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        merge_sort(A, 0, N - 1);

        bw.write(result + "");
        bw.flush();
        bw.close();
    }

    static void merge_sort(int A[], int low, int high){

        if(low < high){
            int mid = (low + high) / 2;
            merge_sort(A, low, mid);
            merge_sort(A, mid + 1, high);
            merge(A, low, mid, high);
        }
    }

    static void merge(int A[], int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int t = 0;


        while(i <= mid && j <= high){
            if(A[i] <= A[j]){
                temp[t++] = A[i++];
            }else{
                temp[t++] = A[j++];
            }
        }

        while(i <= mid){
            temp[t++] = A[i++];
        }

        while(j <= high){
            temp[t++] = A[j++];
        }

        t = 0;
        i = low;

        while(i <= high){
            count++;
            if(count==K){
                result = temp[t];
                break;
            }
            A[i++] = temp[t++];
        }
    }
}
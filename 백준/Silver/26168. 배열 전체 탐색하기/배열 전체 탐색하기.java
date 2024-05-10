import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int first(long [] arr, long key) {

        int lt = 0, rt = arr.length;

        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] >= key) { // 크거나 같은
                rt = mid;
            }
            else {
                lt = mid + 1;
            }
        }

        return lt;
    }

    private static int second(long [] arr, long key) {

        int lt = 0, rt = arr.length;

        while (lt < rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] > key) { // 큰
                rt = mid;
            }
            else {
                lt = mid + 1;
            }
        }

        return lt;
    }

    public static int countInRange(long [] arr, long i, long j) {
        int lower = first(arr, i);
        int upper = second(arr, j);
        return upper - lower;
    }


    public static long solution(String str, long [] arr) {

        StringTokenizer st = new StringTokenizer(str, " ");
        int type = Integer.parseInt(st.nextToken());

        if (type == 1) {
            long k = Long.parseLong(st.nextToken());
            int index = first(arr, k);
            return arr.length - index;
        }

        else if (type == 2) {
            long k = Long.parseLong(st.nextToken());
            int index = second(arr, k);
            return arr.length - index;
        }

        else {
            long i = Long.parseLong(st.nextToken());
            long j = Long.parseLong(st.nextToken());
            return countInRange(arr, i, j);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 배열 크기
        int m = Integer.parseInt(st.nextToken()); // 질의 개수

        long [] arr = new long[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            sb.append(solution(str, arr)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int m, int[] arr) {
        int left = Arrays.stream(arr).max().getAsInt(); // 최소 인출 금액 (하루 최대 지출)
        int right = Arrays.stream(arr).sum(); // 최대 인출 금액 (전체 지출)

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canWithdrawInMCount(arr, n, m, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean canWithdrawInMCount(int[] arr, int n, int m, int k) {
        int count = 1; // 첫 인출
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] > k) {
                count++;
                sum = arr[i];
                if (count > m) {
                    return false;
                }
            } else {
                sum += arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // N일
        int m = Integer.parseInt(st.nextToken()); // M번만 통장에서 꺼내기

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(solution(n, m, arr)));
        bw.flush();
        bw.close();
        br.close();
    }
}

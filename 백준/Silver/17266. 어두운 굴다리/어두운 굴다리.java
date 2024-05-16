import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static boolean isAvailable(int n, int m, int [] arr, int mid) {

        // 시작 지점 검사
        if (arr[0] > mid) return false;

        // 가로등 간 간격 검사
        for(int i = 1; i < m; i++) {
            if (arr[i] - arr[i-1] > 2 * mid) return false;
        }

        // 마지막 지점 검사
        if (n - arr[m-1] > mid) return false;

        return true;
    }

    public static int solution(int n , int m, int [] arr) {

        int answer = 0;
        int lt = 0, rt = n;

        while (lt <= rt) {

            int mid = (lt + rt) / 2;

            if (isAvailable(n, m, arr, mid)) {
                answer = mid;
                rt = mid - 1;

            }
            else {
                lt = mid + 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 굴다리의 길이
        int m = Integer.parseInt(br.readLine()); // 가로등의 개수

        int [] arr = new int[n];

        String str = br.readLine();
        String[] split = str.split(" ");

        for(int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        bw.write(sb.append(solution(n, m, arr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

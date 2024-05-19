import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    // 가능한지 확인
    public static boolean checkIsPossible(long mid, long m, long [] arr) {

        long sum = 0;

        for(long x: arr) {
            if (x > mid) { // mid 는 절단기 높이
                sum += x - mid;
            }
        }

        // sum 이 m 이상이어야 가져갈 수 있음
        if (sum >= m) {
            return true;
        }

        return false;
    }

    public static long getMax(long [] arr) {

        long max = -1;
        for(long x: arr) {
            if (max < x) {
                max = x;
            }
        }

        return max;
    }

    public static long solution(int n, long m, long [] arr) {

        long answer = 0;

        long lt = 0;
        long rt = getMax(arr); // 배열 중 최댓값 구하기

        while (lt <= rt) {
            long mid = (lt + rt) / 2;

            if (checkIsPossible(mid, m, arr)) { // 가능하다면

                // 절단기 높이 설정
                answer = mid;

                // lt 범위 오른쪽으로 줄이기
                lt = mid + 1;
            }

            else {

                // rt 범위 왼쪽으로 줄이기
                rt = mid - 1;
            }
        }


        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 나무의 수
        long m = Long.parseLong(st.nextToken()); // 가져가고자 하는 나무 길이

        st = new StringTokenizer(br.readLine(), " ");

        long [] arr = new long[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        sb.append(solution(n, m, arr));

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

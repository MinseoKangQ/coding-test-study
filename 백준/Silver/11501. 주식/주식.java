import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static long solution(int n, long [] arr) {

        long answer = 0;

        long nowMax = arr[n-1];

        for(int i = n-2; i >= 0; i--) {
            long current = arr[i];

            if (current < nowMax) {
                answer += nowMax - current;
            }

            else {
                nowMax = current;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) { // 테스트 케이스 수 만큼 반복

            int n = Integer.parseInt(br.readLine()); // 숫자 개수

            long[] arr = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[j] = Long.parseLong(st.nextToken());
            }

            sb.append(solution(n, arr)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

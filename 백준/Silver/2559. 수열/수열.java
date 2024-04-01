import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int k, int [] arr) {

        int sum = 0, answer = 0;

        // 초기 값 결정
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        answer = sum;

        for(int i = k; i < n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(sum, answer);
        }

        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(sb.append(solution(n, k, arr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

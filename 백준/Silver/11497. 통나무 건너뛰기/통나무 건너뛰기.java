import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int [] arr, int n) {
        
        Arrays.sort(arr);

        int answer = -1, pre = arr[0];

        for(int j = 2; j < n; j += 2) {
            answer = Math.max(answer, Math.abs(pre - arr[j]));
            pre = arr[j];
        }

        if (n % 2 == 0) n++;

        for(int j = n-2; j > 0; j -= 2) {
            answer = Math.max(answer, Math.abs(pre - arr[j]));
            pre = arr[j];
        }

        answer = Math.max(answer, Math.abs(pre - arr[0]));

        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        StringTokenizer st;
        for(int i = 0; i < T; i ++) { // 테스트 케이스 수 만큼

            int[] arr;

            int n = Integer.parseInt(br.readLine());

            arr = new int[n];

            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            sb.append(solution(arr, n)).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

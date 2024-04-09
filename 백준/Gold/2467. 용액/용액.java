import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] solution(int n, int[] arr) {
        int answerP1 = 0, answerP2 = n - 1;
        int min = Integer.MAX_VALUE;
        int p1 = 0, p2 = n - 1;

        while (p1 < p2) {
            int sum = arr[p1] + arr[p2];

            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                answerP1 = p1;
                answerP2 = p2;
            }

            if (sum > 0) {
                p2--;
            } else {
                p1++;
            }
        }

        return new int[] {arr[answerP1], arr[answerP2]};
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] solution = solution(n, arr);

        for(int x : solution) {
            sb.append(x).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

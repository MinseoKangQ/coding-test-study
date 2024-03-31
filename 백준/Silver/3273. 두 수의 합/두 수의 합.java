import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int [] arr, int x) {

        int count = 0;

        Arrays.sort(arr);

        // 1 2 3 5 7 9 10 11 12

        for(int i = 0; i < n; i++) {

            if (i + 1 >= n) break;
            int p = i+1;

            int sum = 0;
            while (sum < x) {
                sum = arr[i];
                if (p + 1 > n) break;
                sum += arr[p++];
            }

            if (sum == x) count++;

        }

        return count;
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

        int x = Integer.parseInt(br.readLine());

        bw.write(sb.append(solution(n, arr, x)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

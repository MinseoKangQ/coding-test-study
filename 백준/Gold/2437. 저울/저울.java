import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int[] arr) {

        Arrays.sort(arr);

        int smallestUnmeasurable = 1;
        for (int weight : arr) {
            if (weight > smallestUnmeasurable) {
                break;
            }
            smallestUnmeasurable += weight;
        }

        return smallestUnmeasurable;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(Integer.toString(solution(n, arr)));
        bw.flush();

        bw.close();
        br.close();
    }
}

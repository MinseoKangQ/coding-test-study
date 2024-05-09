import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static ArrayList<Integer> solution(int n, int [] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        int min = arr[0];
        int max = arr[0];

        int currentMax = -1;

        for(int x : arr) {

            if (x > max) {
                max = x;
            }

            if (x < min) {
                min = x;
            }

            max = Math.max(currentMax, Math.abs(max - min));
            currentMax = max;
            answer.add(max);

        }

        return answer;
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

        ArrayList<Integer> answer = solution(n, arr);

        for(int x : answer) {
            sb.append(x).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

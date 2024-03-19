import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int solution(ArrayList<Integer> arr) {

        int answer = 0;
        int tmp = 0;
        Collections.sort(arr);

        for(Integer i : arr) {
            tmp = tmp + i;
            answer += tmp;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        sb.append(solution(arr));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

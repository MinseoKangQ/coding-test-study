import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int [] solution(int remain) {

        int [] arr = { 25, 10, 5, 1 };
        int [] answer = new int[4];

        int index = 0;

        while (remain != 0) {
            if(arr[index] > remain) { // 25 124
                index++;
            }
            else {
                remain -= arr[index]; // remain -= 25
                answer[index]++;
            }
        }

        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int remain = Integer.parseInt(st.nextToken());
            int [] answerArr = solution(remain);

            for(int m : answerArr) {
                sb.append(m).append(" ");
            }

            sb.append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

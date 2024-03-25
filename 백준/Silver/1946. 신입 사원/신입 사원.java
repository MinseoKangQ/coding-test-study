import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Score implements Comparable<Score> {

    int a;
    int b;

    public Score(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Score o) {
        return this.a - o.a;
    }

}
public class Main {

    public static int solution(ArrayList<Score> arr) {

        int count = 0;
        Collections.sort(arr);

        int maxRanking = Integer.MAX_VALUE;

        for (Score o : arr) {
            if (o.b < maxRanking) {
                count++;
                maxRanking = o.b;
            }
        }

        return count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) { // 테스트 케이스 수 만큼 반복
            int N = Integer.parseInt(br.readLine()); // 지원자 수
            ArrayList<Score> scores = new ArrayList<>(); // 배열 생성
            for (int j = 0; j < N; j++) { // 지원자 수 만큼 반복
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                scores.add(new Score(a, b));
            }

            // 하나의 테스트 케이스에 대해 메소드 한 번 호출
            sb.append(solution(scores)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

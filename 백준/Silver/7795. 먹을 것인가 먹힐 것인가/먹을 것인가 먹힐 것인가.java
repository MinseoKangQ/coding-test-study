import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int numOfA, int numOfB, ArrayList<Integer> a, ArrayList<Integer> b) {

        int answer = 0, p2 = 0;

        // 오름차순 정렬
        Collections.sort(a);
        Collections.sort(b);

        for(int p1 = 0; p1 < numOfA; p1++) {
            while (p2 < numOfB && b.get(p2) < a.get(p1)) {
                p2++;
            }

            answer += p2;
        }

        return answer;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int numOfA = Integer.parseInt(st.nextToken());
            int numOfB = Integer.parseInt(st.nextToken());

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < numOfA; j++) {
                a.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine(), " ");
            for(int k = 0; k < numOfB; k++) {
                b.add(Integer.parseInt(st.nextToken()));
            }

            sb.append(solution(numOfA, numOfB, a, b)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

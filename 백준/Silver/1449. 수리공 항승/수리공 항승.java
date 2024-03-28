import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int N, int L, ArrayList<Integer> arr) {

        int answer = 0;

        Collections.sort(arr); // 일단 오름차순 정렬

        int start = arr.get(0);

        for(int i = 1; i < N; i++) {
            if (L <= arr.get(i) - start) {
                answer++;
                start = arr.get(i); // 누수 시작 위치 설정
            }
        }

        answer++;

        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 물이 새는 곳의 개수
        int L = Integer.parseInt(st.nextToken()); // 테이프의 길이

        ArrayList<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        bw.write(sb.append(solution(N, L, arr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

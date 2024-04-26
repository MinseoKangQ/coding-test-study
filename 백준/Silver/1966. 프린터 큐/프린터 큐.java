import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int m, LinkedList<int[]> queue) {
        int answer = 0; // 출력 순서

        while (!queue.isEmpty()) {
            int[] front = queue.poll(); // 큐의 첫 번째 원소
            boolean isMax = true; // 가장 큰 중요도를 가지고 있는지 확인

            // 큐에 남은 원소들과 중요도 비교
            for (int i = 0; i < queue.size(); i++) {
                if (front[1] < queue.get(i)[1]) { // [1]은 중요도 비교
                    isMax = false; // 더 큰 중요도를 가진 원소를 찾았으므로 false로 설정
                    break;
                }
            }

            // 가장 큰 중요도를 가진 원소가 아닐 경우
            if (!isMax) {
                queue.offer(front); // 다시 큐의 끝에 추가
                continue;
            }

            // 가장 큰 중요도를 가진 원소인 경우
            answer++; // 출력 순서를 증가
            if (front[0] == m) { // [0]은 위치 비교, 출력하려는 문서가 맞는지 확인
                break;
            }
        }

        return answer; 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());  // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken()); // 문서의 개수
            int m = Integer.parseInt(st.nextToken()); // 출력 순서를 알고 싶은 문서의 초기 위치

            LinkedList<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine(), " ");

            int index = 0;
            while (st.hasMoreTokens()) {
                queue.offer(new int[]{index++, Integer.parseInt(st.nextToken())});  // 각 문서의 초기 위치와 중요도 저장
            }

            sb.append(solution(n, m, queue)).append("\n");  // 결과 저장
        }

        bw.write(sb.toString());  // 결과 출력
        bw.flush();  // 버퍼 비우기

        bw.close();  // BufferedWriter 닫기
        br.close();  // BufferedReader 닫기
    }
}

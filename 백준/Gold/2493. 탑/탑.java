import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static int [] solution(int n, int[] heights) {

        int [] answer = new int[n];
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < n; i++) {

            int height = heights[i]; // 현재 탑 높이

            // 스택이 비어있지 않고, 현재 탑이 더 높다면 계속 pop
            while(!stack.isEmpty() && stack.peek()[1] < height) {
                stack.pop();
            }

            if (stack.isEmpty()) { // 스택이 비었으면 -> 현재 탑이 제일 높다는 것
                answer[i] = 0; // 수신탑 존재하지 않음
            }
            else { // 스택이 비지 않았다면 -> 신호를 받을 탑이 존재한다는 것
                answer[i] = stack.peek()[0] + 1; // 수신탑의 인덱스는 0부터 시작이므로 +1
            }

            stack.push(new int[]{i, height}); // 스택에 푸시

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] heights = new int[n]; // 탑의 높이 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int [] result = solution(n, heights);

        for(int x : result) {
            sb.append(x).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

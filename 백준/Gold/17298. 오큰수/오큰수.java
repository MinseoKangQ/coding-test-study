import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static int [] solution(int n, int [] arr) {

        int [] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        // 9
        // 5
        // 4
        // 8

        // 핵심 -> 거꾸로 돌기
        for(int i = n-1; i >= 0; i--) {

            //  스택이 비어있지 않고, 스택 상단이 현재 수보다 같거나 작은 경우
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop(); // pop
            }

            if (stack.isEmpty()) {
                answer[i] = -1;
            }
            else {
                answer[i] = stack.peek();
            }

            stack.push(arr[i]); // 오른쪽에 있는 수 넣음
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


        for(int x: solution(n, arr)) {
            sb.append(x).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

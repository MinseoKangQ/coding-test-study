import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    public static String solution(String str) {
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char c : str.toCharArray()) {
            switch (c) {
                case '<': // 왼쪽으로 이동
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case '>': // 오른쪽으로 이동
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case '-': // 백스페이스
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                default: // 알파벳이 들어오면 추가
                    leftStack.push(c);
                    break;
            }
        }

        // leftStack과 rightStack을 올바른 순서로 결합
        StringBuilder sb = new StringBuilder();
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        return sb.toString();
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb  = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            String str = br.readLine();

            sb.append(solution(str)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

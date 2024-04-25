import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    public static int solution(String str) {

        int count = 0;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') { // 여는 괄호 만나면
                stack.push('('); // push
            }
            else { // 닫는 괄호 만나면
                stack.pop(); // 일단 pop
                if (str.charAt(i-1) == '(') { // 바로 앞이 여는 괄호면 레이저 쏨
                    count += stack.size();
                }
                else { // 바로 앞이 닫는 괄호면 막대기의 끝
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        bw.write(sb.append(solution(str)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

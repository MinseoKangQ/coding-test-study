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

            char current = str.charAt(i);

            if(current == ')') {
                if (stack.isEmpty() || stack.peek() == ')') {
                    count++;
                }
                else {
                    stack.pop();
                }
            }

            else { // '('
                stack.push(current);
            }

        }

        count += stack.size();

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

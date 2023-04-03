import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static void appendAndPop(Stack stack) {
        while(!stack.empty()) {
            sb.append(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        String s = br.readLine(); // 문자열 입력받기
        
        boolean check = false; // <> 에 포함되어 있는지

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i); // 현재 문자

            if(s.charAt(i) == '<') { // '<' 이면
                appendAndPop(stack); // sb에 append하고 스택에서 pop
                check = true; // <> 에 포함되어 있음
                sb.append(c); // sb에 '<' append
            }
            else if (c == '>') { // '>' 이면
                check = false; // <>에 포함되는 것이 끝남
                sb.append(c); // sb에 '>' append
            }
            else if (check) { // <>에 포함되어 있으면
                sb.append(c); // sb에 현재 문자열 append
            }
            else {
                if(c == ' ') { // 공백이면
                    appendAndPop(stack); // sb에 append하고 스택에서 pop
                    sb.append(c); // sb에 현재 문자열 append
                }
                else { // 현재 문자열이 < 도 아니고 > 도 아니고 <>에 포함되어 있지도 않고 공백도 아니라면
                    stack.push(c); // 스택에 push
                }
            }
        }

        appendAndPop(stack); // sb에 append하고 스택에서 pop

        System.out.print(sb);
    }
}

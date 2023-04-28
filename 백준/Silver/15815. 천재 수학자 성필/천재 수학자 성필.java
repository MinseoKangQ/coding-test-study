import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            // 숫자이면
            if(Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            }

            // 연산자이면
            else {

                int c2 = stack.pop();
                int c1 = stack.pop();

                if(c == '+') { stack.push(c1 + c2); }
                else if (c == '-') { stack.push(c1 - c2);}
                else if (c == '*') { stack.push(c1 * c2); }
                else { stack.push(c1 / c2); }

            }
        }

        System.out.print(stack.pop());

    }
}

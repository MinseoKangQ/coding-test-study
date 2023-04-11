import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack();

        String str = br.readLine();
        String boomStr = br.readLine();

        // 로직
        for(int i = 0; i < str.length(); i++) {

            // 스택에 푸시
            stack.push(str.charAt(i));

            if(stack.size() >= boomStr.length()) { // 스택의 사이즈가 폭발 문자열 길이보다 크다면
                
                boolean isSame = true; // 폭발 문자열과 같은지 확인하는 플래그
                
                for(int j = 0; j < boomStr.length(); j++) { // 폭발 문자열 길이만큼 반복

                    // 문자가 일치하는지 확인
                    if(stack.get(stack.size() - boomStr.length() + j) != boomStr.charAt(j)) {
                        isSame = false; // 같지 않음
                        break; 
                    }
                }
                
                if(isSame) { // 폭발 문자열과 같다면
                    for(int j = 0; j < boomStr.length(); j++) // 폭발 문자열 길이만큼
                        stack.pop(); // 폭발
                }
            }
        }

        for(char c : stack) { // 스택에 있는 요소들을 하나씩 꺼내서
            sb.append(c); // StringBuilder에 넣기
        }

        if(sb.length() > 0) {
            System.out.print(sb);
        }
        else {
            System.out.print("FRULA");
        }

    }
}

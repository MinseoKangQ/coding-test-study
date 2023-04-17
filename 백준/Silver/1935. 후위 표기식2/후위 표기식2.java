import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        // 입력받기 위함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 피연산자 수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 후위표기식 입력받기
        String prefix = br.readLine();

        // 숫자 입력받기
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 스택 생성
        Stack<Double> stack = new Stack<>();

        // 후의표기식의 길이 저장
        int len = prefix.length();

        for(int i = 0; i < len; i++) { // 후위표기식 길이만큼 반복
            
            char ch = prefix.charAt(i); // 현재 문자 저장
            
            if('A' <= ch && ch <= 'Z') {  // 대문자라면
                // push
                double d = arr[ch - 'A'];
                stack.push(d);
            }
            else {  // 연산자라면
                
                // 피연산자 2개 꺼내서
                double d1 = stack.pop();
                double d2 = stack.pop();
                double d3 = 0.0;
                
                // 연산자에 따른 연산
                switch(ch) {
                    case '+' :
                        d3 = d2 + d1;
                        break;
                    case '-' :
                        d3 = d2 - d1;
                        break;
                    case '*' :
                        d3 = d2 * d1;
                        break;
                    case '/' :
                        d3 = d2 / d1;
                        break;
                }
                // 연산 결과 push
                stack.push(d3);
            }
        }
        
        // 출력
        System.out.printf("%.2f", stack.pop());
    }
}
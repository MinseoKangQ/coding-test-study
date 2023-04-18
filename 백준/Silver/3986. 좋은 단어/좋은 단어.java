import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        // 입력받기 위함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 좋은 단어의 개수
        int count = 0;

        // 단어의 수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 단어의 수 만큼 배열 생성
        String [] str = new String[N];

        // 문자열 입력받기
        for(int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for(int i = 0; i < N; i++) { // 배열 길이만큼 반복

            Stack stack = new Stack(); // 스택 생성

            for(int j = 0; j < str[i].length(); j++) { // 문자열의 길이만큼 반복

                // 현재 문자
                char currentC = str[i].charAt(j);

                // 스택이 비어있다면 push
                if(stack.isEmpty()) {
                    stack.push(currentC);
                }

                // 스택이 비어있지 않다면
                else {

                    // 스택의 가장 위의 문자 확인
                    char previousC = (char) stack.peek();

                    // 현재 문자와 가장 위 문자가 같다면 pop
                    if (currentC == previousC) {
                        stack.pop();
                    }

                    // 현재 문자와 가장 위 문자가 같지 않다면
                    else {
                        stack.push(currentC);
                    }
                }


            }

            // 스택이 비어있으면 좋은 단어
            if(stack.isEmpty()) count++;

        }

        System.out.print(count);

    }
}

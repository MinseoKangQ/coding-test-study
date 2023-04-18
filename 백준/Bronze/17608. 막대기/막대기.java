import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 입력받기 위함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 보이는 막대의 개수
        int countVisible = 0;

        // 막대의 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 스택 생성
        Stack stack = new Stack();

        // 막대의 개수만큼 막대의 길이 입력받고, push
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            stack.push(Integer.parseInt(st.nextToken()));
        }

        // 맨 위의 요소 저장
        int top = (int) stack.pop();

        // 맨 위의 요소는 항상 보이니까 count 증가
        countVisible++;


        // 맨 위의 요소를 pop 했으므로 남은 막대의 개수만큼 반복
        for(int i = 0; i < N-1; i++) {
            int value = (int) stack.pop(); // pop 한 값 저장

            // top 값 보다 크면
            if(value > top)  {
                top = value; // top 을 value 로 설정
                countVisible++; // count 증가
            }
        }

        System.out.println(countVisible);
    }
}

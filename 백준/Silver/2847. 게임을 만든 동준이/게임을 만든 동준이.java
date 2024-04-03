import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(int n, int [] arr) {

        int answer = 0;
        int num = arr[n-1] - 1;

        for(int i = n-2; i >= 0; i--) {
            if (num < arr[i]) {
                answer += arr[i] - num;
            }

            // 만들어야 하는 값 처리
            if (num > arr[i] - 1) {
                num = arr[i] - 1;
            }
            else {
                num--;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(br.readLine());

        int [] arr = new int[T];

        for(int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(sb.append(solution(T, arr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int solution(long A, long B) {
        int count = 0;

        while (B > A) {
            if (B % 10 == 1) {
                B /= 10; // 마지막 숫자가 1일 때, 10으로 나눔
            } else if (B % 2 == 0) {
                B /= 2; // B가 짝수일 때, 2로 나눔
            } else {
                return -1; // 위의 두 경우에 해당하지 않으면 A에서 B를 만들 수 없음
            }
            count++;
        }

        if (A == B) {
            return count + 1; // A와 B가 같으면 연산 횟수 + 1 반환
        } else {
            return -1; // 같지 않으면 -1 반환
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        sb.append(solution(A, B));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

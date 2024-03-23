import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(int n) {

        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                n -= 5;
                count++;
            } else if (n % 3 == 0) {
                count++;
                n -= 3;
            } else if (n < 3 || n == 4) {
                return -1;
            } else { // 정확히 나눠 떨어지지 않으면
                if (n-5 < 0) {
                    n -= 3;
                    count++;
                } else {
                    n -= 5;
                    count++;
                }
            }
        }

        if (n < 0) {
            return -1;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        sb.append(solution(N));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

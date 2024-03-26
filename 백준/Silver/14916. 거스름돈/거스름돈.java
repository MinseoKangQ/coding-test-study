import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(int n) {

        int answer = 0;

        if (n == 2 || n == 5) {
            return 1;
        }
        else if (n == 4) {
            return 2;
        }
        else if (n == 1 || n == 3) {
            return -1;
        }

        else {

            while(true) { // n이 양수일 때 까지만 반복

                if (n > 10) { // 10 초과 일 때
                    n -= 5;
                    answer++;
                }

                else { // 10 이하일 때

                    if (n == 3 || n == 1) return -1;
                    else if (n == 5 || n == 2) {
                        answer++;
                        break;
                    }
                    else if (n == 10) {
                        answer += 2;
                        break;
                    }

                    else {

                        if (n % 2 == 0) { // 짝수인 경우
                            answer += n / 2;
                            break;
                        }
                        else { // 홀수인 경우
                            if (n == 7) {
                                answer += 2; // 7
                            }
                            else {
                                answer += 3; // 9
                            }
                            break;

                        }
                    }
                }

            }
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        bw.write(sb.append(solution(n)).toString());
        bw.flush();

        bw.close();
        br.close();


    }
}

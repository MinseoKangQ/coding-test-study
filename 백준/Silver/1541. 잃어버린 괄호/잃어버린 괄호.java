import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(String str) {


        // - 를 기준으로 식 분리
        String [] subtractionParts = str.split("-");
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < subtractionParts.length; i++) {
            int tempSum = 0;

            // + 연산 처리
            String [] additionParts = subtractionParts[i].split("\\+");
            for(String part: additionParts) {
                tempSum += Integer.parseInt(part);
            }

            // 첫 번째 '-' 연산자 이전까지는 더하고, 이후는 모두 빼기
            if (sum == Integer.MAX_VALUE) {
                sum = tempSum;
            } else {
                sum -= tempSum;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        bw.write(sb.append(solution(str)).toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

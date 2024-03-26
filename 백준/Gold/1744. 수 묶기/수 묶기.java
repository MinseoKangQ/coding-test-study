import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static long solution(ArrayList<Long> positives, ArrayList<Long> negatives, boolean hasZero, int onesCount) {
        long answer = 0;

        // 양수 처리
        for (int i = 0; i < positives.size(); i += 2) {
            if (i + 1 < positives.size()) {
                answer += positives.get(i) * positives.get(i + 1); // 양수 두 개를 곱해서 더함
            } else {
                answer += positives.get(i); // 양수가 홀수 개인 경우 마지막 하나 더하기
            }
        }

        // 1 처리
        answer += onesCount; // 1은 곱하는 것보다 더하는 것이 낫기 때문에, 1의 개수를 그대로 더함

        // 음수 처리 (0이 있을 경우, 가장 작은 음수를 없앨 수 있음)
        for (int i = 0; i < negatives.size(); i += 2) {
            if (i + 1 < negatives.size()) {
                answer += negatives.get(i) * negatives.get(i + 1); // 음수 두 개를 곱해서 더함
            } else {
                if (!hasZero) { // 0이 없고 음수가 홀수 개인 경우 마지막 하나 더하기
                    answer += negatives.get(i);
                }
                // 0이 있으면 마지막 음수는 무시(0으로 상쇄)
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Long> positives = new ArrayList<>();
        ArrayList<Long> negatives = new ArrayList<>();
        boolean hasZero = false;
        int onesCount = 0;

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            if (num > 1) {
                positives.add(num);
            } else if (num < 0) {
                negatives.add(num);
            } else if (num == 0) {
                hasZero = true;
            } else { // num == 1
                onesCount++;
            }
        }

        Collections.sort(positives, Collections.reverseOrder()); // 양수는 내림차순 정렬
        Collections.sort(negatives); // 음수는 오름차순 정렬

        long result = solution(positives, negatives, hasZero, onesCount);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

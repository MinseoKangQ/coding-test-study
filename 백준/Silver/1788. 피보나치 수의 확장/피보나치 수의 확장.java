import java.io.*;

public class Main {

    public static long[] solution(int n) {
        long[] arr = new long[Math.abs(n) + 2]; // 음수 계산을 위해 인덱스 조정
        long[] answer = new long[2];

        // 기본값 설정
        arr[0] = 0;
        arr[1] = 1;

        // 양수 및 0에 대한 피보나치 수 계산
        for (int i = 2; i <= Math.abs(n); i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000000;
        }

        // 음수에 대한 피보나치 수 계산 (필요한 경우만)
        if (n < 0 && Math.abs(n) % 2 == 0) {
            arr[Math.abs(n)] = -arr[Math.abs(n)];
        }

        // 결과 설정
        if (n == 0) {
            answer[0] = 0;
        } else {
            answer[0] = arr[Math.abs(n)] > 0 ? 1 : (arr[Math.abs(n)] < 0 ? -1 : 0);
        }
        answer[1] = Math.abs(arr[Math.abs(n)]) % 1000000000;

        return answer;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long [] answer = solution(n);

        sb.append(answer[0]).append("\n").append(answer[1]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

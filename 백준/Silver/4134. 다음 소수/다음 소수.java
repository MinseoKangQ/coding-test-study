import java.io.*;

public class Main {

    // 소수 판별 함수
    public static boolean isPrime(long n) {

        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static long solution(long n) {

        // n이 2보다 작다 -> 가장 작은 소수는 2
        if (n <= 2) return 2;

        // 짝수 -> 소수는 2 밖에 없으므로 n을 홀수로 만듦
        if (n % 2 == 0) n++;

        // 홀수부터 시작 -> 가장 작은 소수 찾기
        while (!isPrime(n)) {
            n += 2;
        }
        return n;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            sb.append(solution(n)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

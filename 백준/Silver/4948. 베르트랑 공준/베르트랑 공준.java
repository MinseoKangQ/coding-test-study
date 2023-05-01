import java.io.*;

public class Main {

    // 소수이면 false
    // 소수가 아니면 true
    public static boolean prime [];

    public static void getPrime(int n) {

        prime = new boolean[2*n+1];
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {

            // 소수가 아니면 반복
            if(prime[i]) continue;

            // 소수이면 i의 배수들을 [ 소수가 아니라고 ] 표시
            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {

            int n = Integer.parseInt(br.readLine());
            int numOfPrime = 0;
            if(n == 0) break;

            getPrime(n);

            for(int i = n+1; i <= 2*n; i++) {
                if(!prime[i]) numOfPrime++;
            }

            sb.append(numOfPrime).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}

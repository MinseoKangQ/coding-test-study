import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 소수 구하기
    public static boolean [] prime = new boolean[1000001];
    public static void getPrime() {
        prime[0] = prime[1] = true;
        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        
        getPrime();

        for(int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());
            int count = 0;

            for(int x = 2; x < N/2; x++) {
                if(!prime[x] && !prime[N-x]) { count++; }
            }
            if(N%2 == 0) { if(!prime[N/2]) count++; }
            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

    }
}

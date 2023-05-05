import java.io.*;

public class Main {

    public static boolean prime [] = new boolean[1299710];
    public static void getPrime() {

        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i*i; j < prime.length; j += i) {
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

        for(int i = 0 ; i < T; i++) {

            int k = Integer.parseInt(br.readLine());

            // 소수가 아니라면
            if(prime[k]) {
                int start = k;
                int end = k;
                while(true) { if(!prime[--start]) break; }
                while(true) { if(!prime[++end]) break; }
                sb.append(end-start).append("\n");
            }

            // 소수라면
            else sb.append(0).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
    }
}

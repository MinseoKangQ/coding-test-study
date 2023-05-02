import java.io.*;
import java.util.HashSet;

public class Main {

    public static boolean prime[];
    public static HashSet hashSet;

    public static void pushPrime(int n) {

        prime = new boolean[n+1];
        hashSet = new HashSet();

        // 소수가 아니다
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {

            if(prime[i]) continue;

            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for(int i = 2; i < prime.length; i++) {
            if(!prime[i])
                hashSet.add(i);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());
            pushPrime(n);

            for(int p = n/2, q = n/2; p >= 2; p--, q++) {
                if (hashSet.contains(p) && hashSet.contains(q)) {
                    sb.append(p).append(" ").append(q).append("\n");
                    break;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}

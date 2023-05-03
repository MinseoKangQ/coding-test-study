import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean prime [] = new boolean[N+1];
        prime[0] = prime[1] = true;
        int count = 0;


        for(int i = 2; i < prime.length; i++) {

            if(prime[i]) continue;

            else {
                count++;
                prime[i] = true;
                if(K == count) {
                    System.out.println(i);
                    break;
                }

                for(int j = i*i; j < prime.length; j += i) {
                    if(prime[j]) continue;
                    else {
                        count++;
                        prime[j] = true;

                    }

                    if (K == count) {
                        System.out.println(j);
                        break;
                    }

                }
            }
        }
    }
}

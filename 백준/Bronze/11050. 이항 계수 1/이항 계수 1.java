import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int factorial(int n) {
        if(n==1) return 1;
        else return n*factorial(n-1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 1;

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if(K > N-K) { K = N-K; }

        if(K == 0) System.out.print(1);
        else {
            for(int i = 0; i < K; i++) {
                result *= N;
                N--;
            }
            result /= factorial(K);
            System.out.print(result);
        }

    }
}

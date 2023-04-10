import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        if(N == 0) System.out.println(1);
        else {
            long result = factorial(N);
            System.out.print(result);
        }
    }

    private static long factorial(long n) {
        if (n<=1) return n;
        else return factorial(n-1)*n;
    }

}

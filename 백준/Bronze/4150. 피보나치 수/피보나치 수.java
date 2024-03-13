import java.io.*;
import java.math.BigInteger;

public class Main {

    public static BigInteger solution(int n) {

        if (n <= 2) return BigInteger.ONE;

        BigInteger [] arr = new BigInteger [n+1];
        arr[1] = BigInteger.ONE;
        arr[2] = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-2].add(arr[i-1]);
        }

        return arr[n];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append(solution(n));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

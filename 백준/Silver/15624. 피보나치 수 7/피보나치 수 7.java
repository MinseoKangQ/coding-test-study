import java.io.*;

public class Main {

    public static long solution(int n) {
        long [] arr = new long[n + 1];
        if(n == 0) return 0;
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++) {
            arr[i] = (arr[i-2] + arr[i-1]) % 1000000007;
        }

        return arr[n];
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long solution = solution(n);
        bw.write(sb.append(solution).toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

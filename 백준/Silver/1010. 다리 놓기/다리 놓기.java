import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] dp = new int[30][30];

    static int combi(int n, int r) { // 재귀
        if(dp[n][r] > 0) { return dp[n][r]; }
        if(n == r || r == 0) { return dp[n][r] = 1; }
        return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int x = 0; x < T; x++) {

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(combi(M, N)).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(int n, String src, String target) {
        int mismatchW = 0, mismatchB = 0;

        for (int i = 0; i < n; i++) {
            if (src.charAt(i) != target.charAt(i)) {
                if (src.charAt(i) == 'W') {
                    mismatchW++;
                } else {
                    mismatchB++;
                }
            }
        }
        
        // 한 쌍의 불일치를 교환하면 두 불일치가 모두 해결
        return Math.max(mismatchW, mismatchB);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            String src = br.readLine();
            String target = br.readLine();

            sb.append(solution(n, src, target)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

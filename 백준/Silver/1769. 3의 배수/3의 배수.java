import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String x = br.readLine();
        int count = 0;

        while (x.length() > 1) { // 10 이상이면 계속 반복
            long sum = 0;

            for(char c: x.toCharArray()) {
                sum += c - '0';
            }

            x = String.valueOf(sum);
            count++;
        }

        sb.append(count).append("\n");

        if ((x.charAt(0) - '0') % 3 == 0) sb.append("YES");
        else sb.append("NO");

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

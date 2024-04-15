import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static String solution(String s, String t) {
        int indexS = 0;
        for (int i = 0; i < t.length() && indexS < s.length(); i++) {
            if (s.charAt(indexS) == t.charAt(i)) {
                indexS++;
            }
        }

        if (indexS == s.length()) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        String inputLine;
        while ((inputLine = br.readLine()) != null && !inputLine.isEmpty()) {
            StringTokenizer st = new StringTokenizer(inputLine, " ");
            if (st.countTokens() == 2) {
                String s = st.nextToken();
                String t = st.nextToken();
                sb.append(solution(s, t)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

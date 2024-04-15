import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static String solution(String str1, String str2) {

        String answer = "Yes";

        if (str2.contains(str1)) return answer;
        else {

            Stack<Character> stack = new Stack<>();
            for(int i = str1.length()-1; i >= 0; i--) {
                stack.push(str1.charAt(i));
            }

            for(int i = 0; i < str2.length(); i++) {
                if (stack.isEmpty()) return "Yes";
                char c = str2.charAt(i);
                if (stack.peek() == c) {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) return "Yes";
            else return "No";

        }
        
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        String inputLine;
        while ((inputLine = br.readLine()) != null && !inputLine.isEmpty()) { // 입력의 끝을 null 또는 빈 문자열로 판단
            StringTokenizer st = new StringTokenizer(inputLine, " ");
            if (st.countTokens() == 2) { // 정확히 두 개의 토큰이 있는지 확인
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

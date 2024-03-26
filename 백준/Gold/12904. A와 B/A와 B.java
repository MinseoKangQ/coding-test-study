import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(String S, String T) {

        String tmp = T;

        if (S.equals(T)) return 1;

        while (true) {

            if (tmp.length() == S.length()) {
                if (tmp.equals(S)) { return 1; }
                else { return 0; }
            }

            else {

                if(tmp.charAt(tmp.length()-1) == 'A') { // 마지막 문자가 A라면
                    tmp = tmp.substring(0, tmp.length()-1);// 마지막 문자 제거하기
                }
                else {
                    tmp = tmp.substring(0, tmp.length()-1); // 마지막 글자 제거하기
                    tmp = new StringBuilder(tmp).reverse().toString();
                }

            }

        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        String T = br.readLine();

        bw.write(sb.append(solution(S, T)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

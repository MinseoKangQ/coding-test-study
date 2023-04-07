import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            // 대문자인 경우
            if(Character.isUpperCase(c)) {
                if(c >= 'N') {
                    c -= 13;
                }
                else {
                    c += 13;
                }
                sb.append(c);
            }

            // 소문자인 경우
            else if(Character.isLowerCase(c)) {
                if(c >= 'n') {
                    c -= 13;
                }
                else {
                    c += 13;
                }
                sb.append(c);
            }

            // 그 이외는 그대로
            else {
                sb.append(c);
            }

        }

        System.out.println(sb);
    }
}

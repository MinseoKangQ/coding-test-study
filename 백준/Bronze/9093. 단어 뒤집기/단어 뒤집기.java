import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            // 문자열 입력받기
            String str = br.readLine();

            // WhiteSpace 기준으로 배열에 저장
            String [] words = str.split(" ");

            // 뒤집은 것은 sb에 저장
            for(int j = 0; j < words.length; j++) {
                for(int k = words[j].length()-1; k >=0; k--) {
                    sb.append(words[j].charAt(k));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}

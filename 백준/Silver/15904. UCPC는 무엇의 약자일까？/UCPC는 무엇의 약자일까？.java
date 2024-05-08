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

        String input = br.readLine();

        input = input.replaceAll("[\\s]", ""); // 공백 제거
        input = input.replaceAll("[a-z]", ""); // 소문자 제거

        // UCPC를 찾아야 함
        String target = "UCPC";
        int index = 0;

        for (int i = 0; i < input.length() && index < target.length(); i++) {
            if (input.charAt(i) == target.charAt(index)) {
                index++;
            }
        }

        if (index == target.length()) {
            sb.append("I love UCPC");
        } else {
            sb.append("I hate UCPC");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

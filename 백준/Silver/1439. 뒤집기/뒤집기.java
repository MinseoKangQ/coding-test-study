import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int solution(String str) {

        int count = 0; // 뒤집는 횟수
        char firstChar = str.charAt(0); // 첫 번째 문자

        char[] charArr = str.toCharArray(); // 배열로 변환
        char previousChar = str.charAt(0); // 이전 문자

        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] != firstChar) { // 현재 문자가 첫 번째 문자와 다르다면
                if (charArr[i] != previousChar) { // 현재 문자와 이전 문자가 다르다면
                    count++;
                }

            }
            previousChar = charArr[i]; // 이전 문자를 현재 문자로 갱신
        }

        return count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        bw.write(sb.append(solution(str)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

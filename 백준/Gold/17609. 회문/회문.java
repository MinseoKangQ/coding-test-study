import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    // 주어진 부분 문자열이 회문인지 검사
    public static boolean isPalindrome(String str, int left, int right) {

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static int solution(String str) {

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) { // 같은 문자라면
                left++; // 왼쪽 인덱스 이동
                right--; // 오른쪽 인덱스 이동
            }
            else { // 다른 문자라면
                
                // 왼쪽 문자 또는 오른쪽 문자를 제거
                if (isPalindrome(str, left + 1, right) || isPalindrome(str, left, right - 1)) {
                    return 1;
                }
                
                // 두 경우 모두 회문이 아니라면 한 문자를 제거해도 회문을 만들 수 없음
                else {
                    return 2;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            int answer = solution(str);
            sb.append(answer).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

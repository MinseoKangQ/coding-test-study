import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static boolean checkFirstCondition(String input) {
        return input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u");
    }

    public static boolean checkSecondCondition(String input) {
        // 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if ("aeiou".indexOf(current) != -1) {
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }
            if (vowelCount >= 3 || consonantCount >= 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkThirdCondition(String input) {
        // 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
        for (int i = 1; i < input.length(); i++) {
            char prev = input.charAt(i - 1);
            char curr = input.charAt(i);
            if (prev == curr && !(prev == 'e' && curr == 'e') && !(prev == 'o' && curr == 'o')) {
                return false;
            }
        }
        return true;
    }

    public static String solution(String input) {
        if (!checkFirstCondition(input)) return "<" + input + "> is not acceptable.";
        if (!checkSecondCondition(input)) return "<" + input + "> is not acceptable.";
        if (!checkThirdCondition(input)) return "<" + input + "> is not acceptable.";
        return "<" + input + "> is acceptable.";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals("end")) break;
            String answer = solution(input);
            sb.append(answer).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

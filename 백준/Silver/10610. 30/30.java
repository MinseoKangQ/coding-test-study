import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static String solution(int [] intArray) {

        // 0 이 포함되어 있지 않다면 -1 리턴
        // 3의 배수가 아니라면 -1 리턴
        boolean isZeroIncluded = false;
        long sum = 0;

        for(int x : intArray) {
            if (x == 0) isZeroIncluded = true;
            sum += x;
        }

        if (!isZeroIncluded || sum % 3 != 0) {
            return "-1";
        }

        // 숫자 만들기

        // 일단 오름차순 정렬
        Arrays.sort(intArray);

        // 내림차순으로 만들기
        StringBuilder sb = new StringBuilder();

        for(int x : intArray) {
            sb.append(x);
        }

        return sb.reverse().toString();

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 입력 받기
        String num = br.readLine();

        // 문자 배열로 만들기
        char[] charArray = num.toCharArray();

        // 정수 배열로 만들기
        int [] intArray = new int[num.length()];
        for(int i = 0; i < num.length(); i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        bw.write(sb.append(solution(intArray)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

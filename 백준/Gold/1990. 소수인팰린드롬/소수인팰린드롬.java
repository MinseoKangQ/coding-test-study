import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    // 팰린드롬
    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number); // 숫자를 문자열로 변환
        int len = numStr.length();
        for(int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 소수
    public static boolean isPrime(int number) {
        if(number < 2) return false; // 1은 소수가 아님
        for(int i = 2; i * i <= number; i++) { // 제곱근까지만 반복
            if(number % i == 0) return false; // i로 나눴을 때 나머지가 0이면 소수가 아님
        }
        return true; // 그렇지 않다면 소수
    }

    public static ArrayList<Integer> findPrimePalindromes(int a, int b) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = a; i <= b; i++) {
            if(isPalindrome(i) && isPrime(i)) {
                answer.add(i);
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Integer> answer = findPrimePalindromes(a, b);
        for(Integer i : answer) {
            sb.append(i).append("\n");
        }

        sb.append(-1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

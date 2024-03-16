import java.io.*;

public class Main {

    public static String solution(String str) {

        int sum = 0;

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) { // 소문자
                int i = (int) x - 96;
                sum += i;
            }
            else { // 대문자
                int i = (int) x - 38;
                sum += i;
            }
        }

        if (isPrime(sum)) {
            return "It is a prime word.";
        }
        else {
            return "It is not a prime word.";
        }

    }

    private static boolean isPrime(int num) {
        if (num < 2) return true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String answer = solution(str);
        sb.append(answer);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

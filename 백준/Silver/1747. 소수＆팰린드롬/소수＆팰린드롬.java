import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static boolean isPalindrome(int N) {

        ArrayList<Character> arr = new ArrayList<>();
        String strN = Integer.toString(N);
        for(int i = 0; i < strN.length(); i++) {
            arr.add(strN.charAt(i));
        }

        Collections.reverse(arr);

        StringBuilder sbN = new StringBuilder();
        for(Character c : arr) {
            sbN.append(c);
        }

        String newStrN = sbN.toString();

        if(strN.equals(newStrN)) return true;
        else return false;
    }

    public static boolean [] prime = new boolean[1003002];
    public static void isPrime() {
        prime[0] = prime[1] = true;
        for(int i = 2; i < Math.sqrt(prime.length); i++) {

            if(prime[i]) continue;

            for(int j = i*i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 소수 찾기
        isPrime();

        for(int i = N; i < prime.length; i++) {
            if(!prime[i]) { // 소수이면
                if(isPalindrome(i)) { // 펠린드롬인지 검사
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

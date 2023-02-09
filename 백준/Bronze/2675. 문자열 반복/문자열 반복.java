import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스의 개수

        for(int i = 0; i < T; i++) { // T번 반복

            int R = scanner.nextInt(); // 문자 반복 횟수
            String S = scanner.next(); // 반복할 문자

            StringBuffer sb = new StringBuffer();

            for(int j = 0; j < S.length(); j++) { // 문자열 S 길이만큼 반복
                char c = S.charAt(j); // 문자열의 i번째 인덱스에 접근해서
                for(int k = 0; k < R; k++) { // 해당 인덱스 문자를 R번 출력
                    sb.append(c);
//                    System.out.print(c);
                }
            }

            System.out.println(sb);
        }
    }
}

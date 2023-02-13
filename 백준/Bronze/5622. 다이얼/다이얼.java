import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        String s = scanner.next();

        // 초를 저장하기 위한 변수
        int countSec = 0;

        // 알파벳과 다이얼 매칭
        int arr [] = { 2, 2, 2, 3, 3, 3,
                       4, 4, 4, 5, 5, 5,
                       6, 6, 6, 7, 7, 7, 7,
                       8, 8, 8, 9, 9, 9, 9 };

        // 문자열에 하나씩 접근하며 알파벳 -> 정수로 바꾸어
        // 인덱스 값으로 넣어주기
        for(int i = 0; i < s.length(); i++) {
            int index = (int)s.charAt(i)-65;
            countSec += arr[index];
        }

        // 문자열 길이만큼 더하기
        countSec += s.length();
        
        // 출력
        System.out.println(countSec);
    }
}

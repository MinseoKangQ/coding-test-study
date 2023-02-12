import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 두 수 입력받기
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        // 문자열로 바꾸기
        String firstNumToString = Integer.toString(firstNum);
        String secondNumToString = Integer.toString(secondNum);

        // 뒤집은 문자열 저장할 변수
        StringBuilder firstNumReverseString = new StringBuilder();
        StringBuilder secondNumReverseString = new StringBuilder();

        // 문자열 뒤집고 저장
        for(int i = 2; i >= 0; i--) {
            firstNumReverseString.append(firstNumToString.charAt(i));
            secondNumReverseString.append(secondNumToString.charAt(i));
        }

        // 뒤집은 숫자를 저장할 변수
        int reverseFirstNum = 0;
        int reverseSecondNum = 0;

        // 문자열을 숫자로 바꾸기
        for(int i = 0, j = 100; i < 3; i++, j /=10) {
            reverseFirstNum += Character.getNumericValue(firstNumReverseString.charAt(i)) * j;
            reverseSecondNum += Character.getNumericValue(secondNumReverseString.charAt(i)) * j;
        }

        // 두 수 비교하고 큰 값 출력
        if(reverseFirstNum > reverseSecondNum) System.out.println(reverseFirstNum);
        else System.out.println(reverseSecondNum);

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean check [] = new boolean [30];

        // 기본은 모두 미제출
        for(boolean b : check) {
            b = false;
        }

        // 입력받은 수 - 1 인덱스의 check 값을 true로
        for(int i = 0; i < 28; i++) {
            int index = scanner.nextInt();
            check[index-1] = true;
        }

        // false인 인덱스 + 1 만 출력
        for(int i = 0; i < check.length; i++) {
            if( check[i] == false ) {
                System.out.println(i + 1);
            }
        }
    }
}

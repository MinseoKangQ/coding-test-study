import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dice [] = new int [6];

        for(int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            dice[num-1]++;
        }

        int caseNum = 1; // 디폴트 케이스 1
        int resultNum = 0; // 결과 출력에 사용할 눈

        // 같은 눈이 몇개인지 판단
        for(int i = 0; i < dice.length; i++) {
            if(dice[i] == 3) {
                caseNum = 3;
                resultNum = i+1;
                break;
            }

            if(dice[i] == 2) {
                caseNum = 2;
                resultNum = i+1;
                 break;
            }
        }

        if (caseNum == 1) {
            // 가장 큰 값 찾기
            for(int i = 0; i < dice.length; i++) {
                if(dice[i] == 1) {
                    if(i+1 > resultNum) {
                        resultNum = i + 1;
                    }
                }
            }
        }

        // 케이스에 따라 출력값 다름
        if(caseNum == 3) {
            System.out.println(10000 + resultNum*1000);
        }
        else if(caseNum == 2) {
            System.out.println(1000 + resultNum*100);
        }
        else System.out.println(resultNum*100);

    }
}
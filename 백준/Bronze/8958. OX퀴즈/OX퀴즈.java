import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력 받기
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            
            // 테스트 문자열 입력받기
            String test = scanner.next();

            // 테스트 문자열 길이 만큼의 배열 생성
            String testString [] = new String [test.length()];

            // 한 글자씩 잘라서 testString 배열에 넣기
            for(int j = 0; j < test.length(); j++) {
                testString[j] = String.valueOf(test.charAt(j));
            }

            // 점수 판별
            boolean isContinue = false;
            int addScore = 0;
            int totalScore = 0;

            for(String x : testString) {
                if(x.equals("O")) { // 문자가 O

                    if(isContinue == true) {
                        addScore++;
                        totalScore += addScore;
                    }
                    else {
                        addScore = 1;
                        totalScore += addScore;
                        isContinue = true;
                    }
                }
                else { // 문자가 X
                    isContinue = false;
                    addScore = 0;
                }
            }
            System.out.println(totalScore);
        }
    }
}
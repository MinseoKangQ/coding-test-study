import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt(); // 테스트 케이스의 개수

        for(int i = 0; i < C; i++) {
            int N = scanner.nextInt(); // 학생의 수

            // 학생의 수 만큼 점수를 받을 배열 생성
            float score [] = new float [N];

            // 학생들의 점수 입력받기
            for(int j = 0; j < score.length; j++) {
                score[j] = scanner.nextFloat();
            }

            // 평균 구하기
            float average = 0;
            for(float x : score) { average += x; }
            average = average / score.length;

            // 평균보다 높은 학생들의 비율 반올림하여 소수점 셋째 자리까지 출력하기
            int averageUpCount = 0;
            for(float x : score) {
                if(x > average) averageUpCount++;
            }

            float ratio =  100 * (averageUpCount / (float)score.length);
            System.out.println(String.format("%.3f", ratio) + "%");
        }

    }
}

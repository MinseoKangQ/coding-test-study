import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 과목의 개수
        int [] score = new int [N];

        for(int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        // 최대값 구하기
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            if(max < score[i]) {
                max = score[i];
            }
        }

        // 새로운 배열 만들고 합 구하기
        double sum = 0;
        for(int i = 0; i < N; i++) {
            sum += (double)score[i]/max*100;
        }

        System.out.println(sum/N);

    }
}

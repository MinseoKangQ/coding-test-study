import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int A [][] = new int [N][M];
        int B [][] = new int [N][M];

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B[i].length; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 결과 출력
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
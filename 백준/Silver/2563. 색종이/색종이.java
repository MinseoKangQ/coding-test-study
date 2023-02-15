import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean arrCheck [][] = new boolean[101][101];

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 색종이 개수 입력받기
        int area = 0;

        for(int i = 0; i < T; i++) {

            // 시작점 입력받기
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();

            for(int a = 0; a < 10; a++) {
                for(int b = 0; b < 10; b++) {
                    arrCheck[startX + a][startY + b] = true;
                }
            }

        }

        for(int x = 0; x < arrCheck.length; x++) {
            for(int y = 0; y < arrCheck[x].length; y++) {
                if(arrCheck[x][y] == true)
                    area++;
            }
        }

        System.out.println(area);

    }

}
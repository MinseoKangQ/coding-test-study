import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr [][] = new int[9][9];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = -1;
        int maxIndexI = 0;
        int maxIndexJ = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    maxIndexI = i+1;
                    maxIndexJ = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxIndexI + " " + maxIndexJ);

    }
}
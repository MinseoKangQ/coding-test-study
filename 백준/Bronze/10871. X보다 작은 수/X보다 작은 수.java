import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int arr [] = new int [N];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int x : arr) {
            if(x < X) System.out.print(x + " ");
        }

    }
}
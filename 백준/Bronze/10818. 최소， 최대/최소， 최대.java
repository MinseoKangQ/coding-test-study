import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int arr [] = new int [N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x : arr) {
            if(x > max) max = x;
            if(x < min) min = x;
        }

        System.out.println(min + " " + max);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr [] = new int [9];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        int max = arr[maxIndex];

        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                maxIndex = i;
                max = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(maxIndex+1);

    }
}

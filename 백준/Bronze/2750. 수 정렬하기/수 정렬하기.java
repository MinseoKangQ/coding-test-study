import java.util.Scanner;

public class Main {

    static int [] BubbleSort(int[] arr) {

        int temp;

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < (arr.length-i)-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr [] = new int [N];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int resultArr[] = BubbleSort(arr);

        for(int x : resultArr) System.out.println(x);
    }
}
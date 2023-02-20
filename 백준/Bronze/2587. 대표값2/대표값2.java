import java.util.Scanner;

public class Main {

    static int [] BubbleSort(int [] arr) {

        int temp;

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0 ; j < (arr.length-i)-1; j++) {
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

        int arr [] = new int [5];

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        arr = BubbleSort(arr);

        System.out.println(sum / arr.length);
        System.out.println(arr[arr.length/2]);
    }
}
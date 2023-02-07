import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String numOfString = scanner.next();

        int array [] = new int [N];

        for(int i = 0; i < N; i++) {
            array[i] = Character.getNumericValue(numOfString.charAt(i));
        }

        int sum = 0;
        for(int x : array) sum += x;

        System.out.println(sum);

    }
}

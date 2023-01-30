import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int total = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            int num = scanner.nextInt();
            sum +=  price * num;
        }

        if(total == sum) System.out.println("Yes");
        else System.out.println("No");

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long C = scanner.nextLong();
        long D = scanner.nextLong();

        String str1 = Long.toString(A) + Long.toString(B);
        String str2 = Long.toString(C) + Long.toString(D);

        System.out.print(Long.parseLong(str1) + Long.parseLong(str2));
    }
}

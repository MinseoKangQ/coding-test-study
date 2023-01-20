import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int leapYear = scanner.nextInt();

        if (leapYear % 4 == 0 && (leapYear % 100 != 0 || leapYear % 400 == 0))
            System.out.println("1");
        else System.out.println("0");

    }
}
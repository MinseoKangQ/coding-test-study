import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M -45 < 0) {
            M = 60 + M - 45;

            if(H-1 < 0)
                H = 23;
            else
                H--;
        }

        else {
            M -= 45;
        }

        System.out.println(H + " " + M);

    }
}
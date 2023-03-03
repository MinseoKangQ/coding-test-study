import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int existPiece [] = new int[6];
        int rightPiece [] = { 1, 1, 2, 2, 2, 8 };

        for(int i = 0; i < existPiece.length; i++) {
            existPiece[i] = scanner.nextInt();
            sb.append(rightPiece[i]-existPiece[i]).append(" ");
        }

        System.out.println(sb);
    }
}
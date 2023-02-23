import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int array [] = new int [3];
        int result = 0;

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        for(int i = 0; i < 3; i++) {
            array[i] = firstNum * (Character.getNumericValue(Integer.toString(secondNum).charAt(2-i)));
            secondNum /= 10;
            sb.append(array[i]).append("\n");
        }

        result += array[0];
        result += array[1] * 10;
        result += array[2] * 100;
        sb.append(result);

        System.out.println(sb);
    }
}

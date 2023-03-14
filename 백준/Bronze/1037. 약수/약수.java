import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            arr.add(scanner.nextInt());
        }

        Collections.sort(arr);

        System.out.print(arr.get(0) * arr.get(arr.size()-1));

    }
}

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            arrayList.add(scanner.nextInt());
        }

        Collections.sort(arrayList);
        
        for(int x : arrayList) sb.append(x).append("\n");

        System.out.println(sb);

    }
}
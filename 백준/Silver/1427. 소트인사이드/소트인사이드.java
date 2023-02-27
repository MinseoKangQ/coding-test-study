import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        int num = Integer.parseInt(bf.readLine());
        String numString = Integer.toString(num);

        for(int i = 0; i < numString.length(); i++) {
            arr.add(Character.getNumericValue(numString.charAt(i)));
        }

        Collections.sort(arr);
        Collections.reverse(arr);

        for(int i = 0; i < numString.length(); i++) {
            sb.append(arr.get(i));
        }

        System.out.print(sb);
    }
}
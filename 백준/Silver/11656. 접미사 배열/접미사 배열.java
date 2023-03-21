import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            arr.add(str.substring(i));
        }

        Collections.sort(arr);
        for(String s : arr) sb.append(s).append("\n");

        System.out.print(sb);

    }
}

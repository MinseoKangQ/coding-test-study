import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++) { arr.add(0); }

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            int asciiNum = str.charAt(i);
            arr.set(asciiNum - 97, arr.get(asciiNum - 97) + 1);
        }

        for(int x : arr) { sb.append(x).append(" "); }

        System.out.print(sb);

    }
}

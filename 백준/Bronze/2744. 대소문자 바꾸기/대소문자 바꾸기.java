import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                sb.append(Character.toLowerCase(str.charAt(i)));
            else
                sb.append(Character.toUpperCase(str.charAt(i)));
        }

        System.out.print(sb);
    }
}

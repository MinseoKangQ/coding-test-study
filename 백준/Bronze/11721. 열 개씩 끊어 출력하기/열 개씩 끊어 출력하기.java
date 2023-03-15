import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i = 1; i <= str.length(); i++) {
            if(i % 10 == 0) sb.append(str.charAt(i-1)).append("\n");
            else sb.append(str.charAt(i-1));
        }

        System.out.print(sb);
    }
}

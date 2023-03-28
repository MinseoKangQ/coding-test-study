import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        sb.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == '-') {
                sb.append(str.charAt(i+1));
                i++;
            }
        }

        System.out.print(sb);
    }
}

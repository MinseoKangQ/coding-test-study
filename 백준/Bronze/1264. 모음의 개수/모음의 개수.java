import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {

            String str = br.readLine();

            if(str.equals("#")) break;

            int count = 0;
            for(int i = 0; i < str.length(); i++) {
                char current = str.charAt(i);

                if(current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u'
                || current == 'A' || current == 'E' || current == 'I' || current == 'O' || current == 'U') {
                    count++;
                }
            }

            sb.append(count).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

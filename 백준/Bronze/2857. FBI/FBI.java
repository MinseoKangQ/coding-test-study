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

        boolean isExist = false;

        for (int i = 1 ; i <= 5; i++) {

            String str = br.readLine();
            if (str.contains("FBI")) {
                sb.append(i).append(" ");
                isExist = true;
            }

        }

        if(!isExist) sb.append("HE GOT AWAY!");
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

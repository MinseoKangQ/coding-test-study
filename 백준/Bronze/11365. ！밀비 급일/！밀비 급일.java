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

        while (true) {

            String str = br.readLine();
            if (str.equals("END")) break;

            StringBuilder tmp = new StringBuilder();
            sb.append(tmp.append(str).reverse()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

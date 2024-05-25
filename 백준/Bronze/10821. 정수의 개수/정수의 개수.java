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

        String str = br.readLine();
        String [] split = str.split(",");

        int count = 0;

        for(int i = 0; i < split.length; i++) {
            String current = split[i];

            boolean isNum = true;
            for(int j = 0; j < current.length(); j++) {
                if (current.charAt(j) < '0' && current.charAt(j) > '9') {
                    isNum = false;
                    break;
                }
            }

            if (isNum) count++;
        }

        bw.write(sb.append(count).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

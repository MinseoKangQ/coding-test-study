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

        long S = Long.parseLong(br.readLine());

        long sum = 0;
        long num = 0;

        while (true) {

            if(sum > S) {
                num--;
                break;
            }

            else {
                num++;
                sum += num;
            }

        }

        bw.write(sb.append(num).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

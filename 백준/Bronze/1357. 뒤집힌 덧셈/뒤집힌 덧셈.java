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

        String[] split = str.split(" ");

        StringBuilder tmp = new StringBuilder();

        int revX = Integer.parseInt(tmp.append(split[0]).reverse().toString());

        tmp = new StringBuilder();

        int revY = Integer.parseInt(tmp.append(split[1]).reverse().toString());

        tmp = new StringBuilder();
        int result = Integer.parseInt(tmp.append(revX + revY).reverse().toString());

        bw.write(sb.append(result).toString());
        bw.flush();

        bw.close();
        br.close();


    }
}

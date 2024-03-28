import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static String solution(String str) {

        while(str.contains("XXXX")) {
            str = str.replace("XXXX", "AAAA");
        }

        while(str.contains("XX")) {
            str = str.replace("XX", "BB");
        }

        if (str.contains("X")) return String.valueOf(-1);
        else return str;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        bw.write(sb.append(solution(str)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

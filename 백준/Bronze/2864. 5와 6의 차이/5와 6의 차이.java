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

        String num1 = split[0];
        String num2 = split[1];

        StringBuilder minSb1 = new StringBuilder();
        StringBuilder minSb2 = new StringBuilder();

        // 최솟값
        for(int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            if (c == '6') minSb1.append(5);
            else minSb1.append(c);
        }

        // 최댓값
        for(int i = 0; i < num2.length(); i++) {
            char c = num2.charAt(i);
            if (c == '6') minSb2.append(5);
            else minSb2.append(c);
        }

        int min = Integer.parseInt(minSb1.toString()) + Integer.parseInt(minSb2.toString());

        StringBuilder maxSb1 = new StringBuilder();
        StringBuilder maxSb2 = new StringBuilder();

        // 최솟값
        for(int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            if (c == '5') maxSb1.append(6);
            else maxSb1.append(c);
        }

        // 최댓값
        for(int i = 0; i < num2.length(); i++) {
            char c = num2.charAt(i);
            if (c == '5') maxSb2.append(6);
            else maxSb2.append(c);
        }

        int max = Integer.parseInt(maxSb1.toString()) + Integer.parseInt(maxSb2.toString());

        bw.write(sb.append(min).append(" ").append(max).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static String getWord(final String str, final int i, final int j) {

        StringBuilder sb1 = new StringBuilder(str.substring(0, i));
        StringBuilder sb2 = new StringBuilder(str.substring(i, j));
        StringBuilder sb3 = new StringBuilder(str.substring(j));

        StringBuilder answer = new StringBuilder();
        answer.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int length = str.length();

        List<String> arr = new ArrayList<>();

        for(int i = 1; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                arr.add(getWord(str, i ,j));
            }
        }

        Collections.sort(arr);

        bw.write(sb.append(arr.get(0)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

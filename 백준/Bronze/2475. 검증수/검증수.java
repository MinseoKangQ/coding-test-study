import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int verifiedNum = 0;

        while(st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            verifiedNum += (x*x);
        }

        verifiedNum %= 10;
        System.out.println(verifiedNum);
    }
}

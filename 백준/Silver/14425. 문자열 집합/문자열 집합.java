import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashSet<String> S = new HashSet<>();
        int count = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            S.add(br.readLine());
        }

        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            if(S.contains(str)) {
                count++;
            }
        }

        System.out.print(count);

    }
}

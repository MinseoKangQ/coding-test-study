import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            map1.put(i, str);
            map2.put(str, i);
        }

        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(map2.containsKey(str)) {
                sb.append(map2.get(str)).append("\n");
            }
            else
                sb.append(map1.get(Integer.parseInt(str))).append("\n");
        }

        System.out.print(sb);

    }
}

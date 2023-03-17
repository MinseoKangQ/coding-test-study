import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        StringTokenizer st4 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(st1.nextToken());
        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(st2.nextToken());
            if(!map.containsKey(x)) { // 포함되어 있지 않으면
                map.put(x, 1);
            }
            else { // 포함되어 있으면
                int j = map.get(x);
                j++;
                map.put(x, j);
            }
        }

        int M = Integer.parseInt(st3.nextToken());
        for(int i = 0; i < M; i++) {
            int x = Integer.parseInt(st4.nextToken());
            if(!map.containsKey(x)) { sb.append("0 ");}
            else sb.append(map.get(x)).append(" ");
        }

        System.out.print(sb);
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(set.contains(str)) {
                result.add(str);
            }
        }

        Collections.sort(result);

        for(int i = 0; i < result.size(); i++) {
            if(i == result.size()-1) sb.append(result.get(i));
            else sb.append(result.get(i)).append("\n");
        }

        System.out.println(result.size());
        System.out.print(sb);
    }
}

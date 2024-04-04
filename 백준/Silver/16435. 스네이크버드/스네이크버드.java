import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int n, int l, ArrayList<Integer> arr) {

        Collections.sort(arr);

        for(int i : arr) {
            if (l >= i) l++;
            else break;
        }

        return l;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        bw.write(sb.append(solution(n, l, arr)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

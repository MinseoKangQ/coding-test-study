import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static int solution(ArrayList<Integer> arr, int n) {

        int count = 0;
        int max = -1;

        for(int x : arr) {
            count += x;
            if (max < x) {
                max = x;
            }
        }

        return count + (max * (n-2));
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        bw.write(sb.append(solution(arr, n)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

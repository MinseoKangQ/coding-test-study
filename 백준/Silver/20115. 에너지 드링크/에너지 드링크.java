import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static double solution(ArrayList<Integer> arr) {

        Collections.sort(arr);
        Collections.reverse(arr);

        double answer = arr.get(0);

        for(int i = 1; i < arr.size(); i++) {
            answer += (double) arr.get(i) / 2;
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        DecimalFormat formatter = new DecimalFormat("#.#####");
        sb.append(formatter.format(solution(arr)));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

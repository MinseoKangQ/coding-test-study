import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int remain, ArrayList<Integer> packages, ArrayList<Integer> one) {

        int answer = 0;
        Collections.sort(packages);
        Collections.sort(one);

        while (remain > 0) {
            if (remain <= 6) { // 남은 기타줄이 6개 이하
                if (packages.get(0) > remain * one.get(0)) {
                    answer += remain * one.get(0);
                }
                else {
                    answer += packages.get(0);
                }

                remain = 0;
            }

            else { // 남은 기타줄이 6개 초과
                if (packages.get(0) > 6 * one.get(0)) {
                    answer += 6 * one.get(0);
                }
                else {
                    answer += packages.get(0);
                }

                remain -= 6;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> packages = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();


        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int p = Integer.parseInt(st.nextToken());
            int o = Integer.parseInt(st.nextToken());

            packages.add(p);
            one.add(o);
        }

        bw.write(sb.append(solution(N, packages, one)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

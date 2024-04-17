import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Participants implements Comparable<Participants> {
    int num;
    double x;

    public Participants() {
    }

    public Participants(int num, double x) {
        this.num = num;
        this.x = x;
    }

    @Override
    public int compareTo(Participants o) {
        if (this.num == o.num) return Double.compare(o.x, this.x); // 내림차순 정렬
        else return this.num - o.num; // 오름차순 정렬
    }
}

public class Main {

    public static double solution(int n, int m, int k, ArrayList<Participants> arr) {

        double answer = 0;
        ArrayList<Double> best = new ArrayList<>();
        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i+= m) {
            best.add(arr.get(i).x);
        }

        Collections.sort(best);
        Collections.reverse(best);

        for(int i = 0; i < k; i++) {

            answer += best.get(i);
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 참가자 수
        int M = Integer.parseInt(st.nextToken()); // 장르 개수
        int K = Integer.parseInt(st.nextToken()); // 본선 진출 인원 수

        ArrayList<Participants> arr = new ArrayList<Participants>();

        for(int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                double x = Double.parseDouble(st.nextToken());
                arr.add(new Participants(num, x));
            }
        }

        double result = solution(N, M, K, arr);
        double roundedResult = Math.round(result * 10) / 10.0;
        bw.write(String.valueOf(roundedResult));

        bw.flush();

        bw.close();
        br.close();
    }
}

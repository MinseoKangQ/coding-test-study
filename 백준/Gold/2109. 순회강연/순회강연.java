import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture implements Comparable<Lecture> {

    int day;
    int pay;

    public Lecture(int pay, int day) {
        this.day = day;
        this.pay = pay;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day; // 시간 내림차순 정렬
    }
}
public class Main {

    public static int solution(int n , ArrayList<Lecture> arr, int maxDay) {

        int answer = 0, j = 0;

        Collections.sort(arr); // 내림차순 정렬

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 큰 값 우선순위

        for(int i = maxDay; i > 0; i--) {
            for(; j < n; j++) {
                if (arr.get(j).day < i) break;
                pQ.offer(arr.get(j).pay);
            }

            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        ArrayList<Lecture> arr = new ArrayList<>();

        int max = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int pay = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            if (day > max) max = day;
            arr.add(new Lecture(pay, day));
        }

        bw.write(sb.append(solution(n, arr, max)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time> {

    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (o.end == this.end) return this.start - o.start;
        else return this.end - o.end;
    }
}
public class Main {

    public static int solution(ArrayList<Time> arr) {

        Collections.sort(arr);

        int answer = 0;
        int endTime = -1;

        for(Time time : arr) {
            if (endTime <= time.start) {
                endTime = time.end;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        ArrayList<Time> arr = new ArrayList<>();

        for(int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr.add(new Time(start, end));

        }

        bw.write(sb.append(solution(arr)).toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

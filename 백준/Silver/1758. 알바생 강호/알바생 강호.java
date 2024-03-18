import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Body implements Comparable<Body> {

    int money;
    int priority;

    public Body(int money, int priority) {
        this.money = money;
        this.priority = priority;
    }

    @Override
    public int compareTo(Body o) {
        return o.money - this.money;
    }
}
public class Main {

    public static long solution(ArrayList<Body> arr) {
        long answer = 0;

        Collections.sort(arr);

        for(int i = 1; i <= arr.size(); i++) {
            if (arr.get(i-1).money - (i - 1) > 0) {
                answer = answer + (arr.get(i-1).money - (i - 1));
            }
        }


        return answer;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<Body> arr = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            arr.add(new Body(money, i));
        }

        sb.append(solution(arr));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

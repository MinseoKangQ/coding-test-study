import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Go implements Comparable<Go>{

    int money;
    int km;

    public void setMoney(int money) {
        this.money = money;
    }

    public Go(int km) {
        this.km = km;
    }


    @Override
    public int compareTo(Go o) {
        return this.money - o.money;
    }
}
public class Main {

    public static long solution(long init, ArrayList<Go> arr, long remain) {

        long answer = init;
        arr.remove(0);
        arr.remove(arr.size()-1);

        Collections.sort(arr);

        answer = answer + arr.get(0).money * remain;

        return answer;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Go> arr = new ArrayList<>();
        int totalKm = 0;

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        // km
        for(int i = 0; i < N-1; i++) {
            int km = Integer.parseInt(st1.nextToken());
            arr.add(new Go(km));
            totalKm += km;
        }

        arr.add(new Go(0));

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // money
        for(int i = 0; i < N; i++) {
            arr.get(i).setMoney(Integer.parseInt(st2.nextToken()));
        }

        long init = (long) arr.get(0).km * arr.get(0).money;
        sb.append(solution(init, arr, totalKm - arr.get(0).km));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

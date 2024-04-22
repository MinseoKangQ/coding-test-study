import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Person implements Comparable<Person>{
    String name;
    int dd;
    int mm;
    int year;

    public Person() {
    }

    public Person(String name, int dd, int mm, int year) {
        this.name = name;
        this.dd = dd;
        this.mm = mm;
        this.year = year;
    }

    @Override
    public int compareTo(Person o) { // 연도가 같다면, 달이 빨라야 즉 낮아야 함, 달이 같다면 날이 낮아야 함
        // 나이 순으로 오름차순 정렬
        if (this.year == o.year) return this.mm - o.mm;
        if (this.mm == o.mm) return this.dd - o.dd;
        else return this.year - o.year;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<Person> arr = new ArrayList<>();


        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int dd = Integer.parseInt(st.nextToken());
            int mm = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            arr.add(new Person(name, dd, mm, year));
        }

        Collections.sort(arr);

        sb.append(arr.get(n-1).name).append("\n").append(arr.get(0).name);

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

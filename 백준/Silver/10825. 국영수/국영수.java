import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
    String name;
    int korea;
    int english;
    int math;

    public Person(String name, int korea, int english, int math) {
        this.name = name;
        this.korea = korea;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Person o) {

        if (this.korea != o.korea) { // 일단
            return o.korea - this.korea; // 국어 내림차순
        }

        if (this.english != o.english) { // 영어 점수가 같다면
            return this.english - o.english; // 영어 오름차순
        }

        if (this.math != o.math) { // 국어 점수와 영어 점수가 같다면
            return o.math - this.math; // 수학 내림차순
        }

        return this.name.compareTo(o.name); // 이름 오름차순
    }


}
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = null;

        ArrayList<Person> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String name = st.nextToken();
            int korea = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            arrayList.add(new Person(name, korea, english, math));
        }

        Collections.sort(arrayList);

        for(int i = 0; i < n; i++) {
            sb.append(arrayList.get(i).name).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}

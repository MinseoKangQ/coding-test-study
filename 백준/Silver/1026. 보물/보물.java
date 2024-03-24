import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int solution(ArrayList<Integer> arrA, ArrayList<Integer> arrB) {

        int answer = 0;

        Collections.sort(arrA); // 오름차순 정렬
        Collections.sort(arrB); // 오름차순 정렬
        Collections.reverse(arrB); // 반대로 뒤집기 -> 내림차순 정렬

        for(int i = 0; i < arrA.size(); i++) {
            answer += arrA.get(i) * arrB.get(i);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            arrA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arrB.add(Integer.parseInt(st.nextToken()));
        }

        bw.write(sb.append(solution(arrA, arrB)).toString());
        bw.flush();
        bw.close();
        br.close();

    }
}

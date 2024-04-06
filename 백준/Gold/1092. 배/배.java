import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {


    public static int solution(int n, int m, ArrayList<Integer> weightArr, ArrayList<Integer> boxArr) {

        int answer = 0;

        // 크레인과 박스를 내림차순으로 정렬
        Collections.sort(weightArr, Collections.reverseOrder());
        Collections.sort(boxArr, Collections.reverseOrder());

        // 가장 무거운 박스를 옮길 수 없는 경우 -1 반환
        if (boxArr.get(0) > weightArr.get(0)) {
            return -1;
        }

        while(!boxArr.isEmpty()) {
            int boxIdx = 0, craneIdx = 0;

            while (craneIdx < n) {
                if (boxIdx == boxArr.size())
                    break;
                else if (weightArr.get(craneIdx) >= boxArr.get(boxIdx)) {
                    boxArr.remove(boxIdx);
                    craneIdx++;
                } else
                    boxIdx++;
            }

            answer++;

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> weightArr = new ArrayList<>();
        ArrayList<Integer> boxArr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            weightArr.add(Integer.parseInt(st.nextToken()));
        }


        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++) {
            boxArr.add(Integer.parseInt(st.nextToken()));
        }

        bw.write(sb.append(solution(n, m, weightArr, boxArr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int solution(int [] arr, int x) {

        int answer = -1;
        int lt = 0, rt = arr.length-1;

        while(lt <= rt) {

            int mid = (lt + rt) / 2;

            if (arr[mid] == x) {
                answer = mid; // x를 찾았다면 위치를 업데이트
                rt = mid - 1; // 더 왼쪽에 같은 값이 존재하는지 확인하기 위해 오른쪽 경계 줄이기
            }
            else if (arr[mid] < x) {
                lt = mid + 1;
            }
            else {
                rt = mid - 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 원소의 개수
        int M = Integer.parseInt(st.nextToken()); // 질문의 개수

        int [] a = new int[N];

        // 배열 입력받기
        for(int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);


        // 질문 받기
        for(int i= 0; i < M; i++) {
            int x = Integer.parseInt(br.readLine());
            sb.append(solution(a, x)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();




    }
}

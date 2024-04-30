import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[1001];
        int start = Integer.MAX_VALUE;
        int end = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int index = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            arr[index] = height;
            start = Math.min(index, start); // 최소값 구하기
            end = Math.max(index, end); // 최대값 구하기
        }

        Stack<Integer> stack = new Stack<>();

        // 왼쪽부터 가장 높은 높이까지 비교
        int temp = arr[start]; // 기둥 높이
        for(int i = start + 1; i <= end; i++) {
            if (arr[i] < temp) { // 현재 기둥 높이가 더 높으면
                stack.push(i); // 푸시
            }
            else {
                while (!stack.isEmpty()) { // 현재 기둥 높이가 더 낮으면 스택이 빌 때 까지
                    int x = stack.pop(); // pop
                    arr[x] = temp; // 기둥 높이 변경
                }
                temp = arr[i];
            }
        }

        stack.clear(); // 스택 비우기

        // 오른쪽부터 가장 높은 높이까지 비교
        temp = arr[end];
        for(int i = end - 1; i >= start; i--) {
            if (arr[i] < temp) stack.push(i);
            else {
                while(!stack.isEmpty()) {
                    int x = stack.pop();
                    arr[x] = temp;
                }
                temp = arr[i];
            }
        }

        int result = 0;
        for(int i = start; i <= end; i++) {
            result += arr[i];
        }

        bw.write(sb.append(result).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

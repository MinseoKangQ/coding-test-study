import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static Stack<Integer> stack = new Stack<>();

    public static int solution(int [] arr) {

        if (arr[0] == 1) {
            stack.push(arr[1]);
            return -2;
        }
        else if (arr[0] == 2) {
            if (!stack.isEmpty()) return stack.pop();
            else return -1;
        }
        else if (arr[0] == 3) {
            return stack.size();
        }
        else if (arr[0] == 4) {
            if (stack.isEmpty()) return 1;
            else return 0;
        }
        else {
            if (!stack.isEmpty()) return stack.peek();
            else return -1;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            int [] arr = new int[2];
            st = new StringTokenizer(br.readLine(), " ");
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                int num = Integer.parseInt(st.nextToken());
                arr[0] = command;
                arr[1] = num;
            }
            else {
                arr[0] = command;
            }

            int solution = solution(arr);

            if (solution != -2) {
                sb.append(solution).append("\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

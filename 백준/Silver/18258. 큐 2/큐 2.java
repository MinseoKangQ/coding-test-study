import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>(); // 큐 선언

        for(int i = 0; i < n; i++) {

            String input = br.readLine(); // 한 줄 입력받기

            if (input.startsWith("push")) { // push X: 정수 X를 큐에 넣는 연산이다.
                int num = Integer.parseInt(input.split(" ")[1]);
                queue.offer(num);
            }
            else if (input.equals("pop")){ // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                if (!queue.isEmpty()) sb.append(queue.poll()).append("\n");
                else sb.append(-1).append("\n");

            }
            else if (input.equals("size")) { // size: 큐에 들어있는 정수의 개수를 출력한다.
                sb.append(queue.size()).append("\n");
            }
            else if (input.equals("empty")) { // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
                if (queue.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if (input.equals("front")) { // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                if (queue.isEmpty()) sb.append(-1).append("\n");
                else sb.append(queue.peek()).append("\n");
            }
            else { // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                if (queue.isEmpty()) sb.append(-1).append("\n");
                else sb.append(queue.peekLast()).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

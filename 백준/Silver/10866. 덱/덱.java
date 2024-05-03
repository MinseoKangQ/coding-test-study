import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < T; i++) {

            // 명령 입력받기
            String command = br.readLine();

            // push_front
            if (command.startsWith("push_front")) {
                deque.addFirst(Integer.valueOf(command.split(" ")[1]));
            }

            // push_back
            else if (command.startsWith("push_back")) {
                deque.addLast(Integer.valueOf(command.split(" ")[1]));
            }

            // pop_front
            else if (command.equals("pop_front")) {
                if (deque.isEmpty()) sb.append(-1);
                else sb.append(deque.removeFirst());
                sb.append("\n");
            }

            // pop_back
            else if (command.equals("pop_back")) {
                if (deque.isEmpty()) sb.append(-1);
                else sb.append(deque.removeLast());
                sb.append("\n");
            }

            // size
            else if (command.equals("size")) {
                sb.append(deque.size());
                sb.append("\n");
            }

            // empty
            else if (command.equals("empty")) {
                if (deque.isEmpty()) sb.append(1);
                else sb.append(0);
                sb.append("\n");
            }

            // front
            else if (command.equals("front")) {
                if (deque.isEmpty()) sb.append(-1);
                else sb.append(deque.peekFirst());
                sb.append("\n");
            }

            // back
            else {
                if (deque.isEmpty()) sb.append(-1);
                else sb.append(deque.peekLast());
                sb.append("\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> scoreStack = new Stack<>();
        Stack<Integer> timeStack = new Stack<>();
        int total = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int isGiven = Integer.parseInt(st.nextToken());

            if (isGiven == 0) {
                if (!timeStack.empty()) {
                    int decreaseTime = timeStack.pop();
                    decreaseTime--;
                    if (decreaseTime == 0) {
                        total += scoreStack.pop();
                    } else {
                        timeStack.push(decreaseTime);
                    }
                }
            } else {
                int score = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                time--;
                if(time == 0) {
                    total += score;
                }
                else {
                    timeStack.push(time);
                    scoreStack.push(score);
                }
            }
        }

        System.out.println(total);
    }
}

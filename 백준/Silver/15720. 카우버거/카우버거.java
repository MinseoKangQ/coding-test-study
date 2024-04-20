import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int burgerNum = Integer.parseInt(st.nextToken());
        int sideNum = Integer.parseInt(st.nextToken());
        int drinkNum = Integer.parseInt(st.nextToken());

        ArrayList<Integer> burger = new ArrayList<>();
        ArrayList<Integer> side = new ArrayList<>();
        ArrayList<Integer> drink = new ArrayList<>();

        int sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < burgerNum; i++) {
            burger.add(Integer.parseInt(st.nextToken()));
            sum += burger.get(i);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < sideNum; i++) {
            side.add(Integer.parseInt(st.nextToken()));
            sum += side.get(i);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < drinkNum; i++) {
            drink.add(Integer.parseInt(st.nextToken()));
            sum += drink.get(i);
        }

        Collections.sort(burger);
        Collections.sort(side);
        Collections.sort(drink);

        Stack<Integer> burgerS = new Stack<>();
        Stack<Integer> sideS = new Stack<>();
        Stack<Integer> drinkS = new Stack<>();

        for(int i = 0; i < burgerNum; i++) {
            burgerS.push(burger.get(i));
        }

        for(int i = 0; i < sideNum; i++) {
            sideS.push(side.get(i));
        }

        for(int i = 0; i < drinkNum; i++) {
            drinkS.push(drink.get(i));
        }

        int answer = 0;
        while(true) {

            if (sideS.isEmpty() || burgerS.isEmpty() || drinkS.isEmpty()) break;

            int set = 0;

            set += burgerS.pop();
            set += sideS.pop();
            set += drinkS.pop();

            set = set / 100 * 90;
            answer += set;

        }

        if (!sideS.isEmpty()) {
            for(int x: sideS) {
                answer += x;
            }
        }

        if (!burgerS.isEmpty()) {
            for(int x: burgerS) {
                answer += x;
            }
        }

        if (!drinkS.isEmpty()) {
            for(int x : drinkS) {
                answer += x;
            }
        }

        bw.write(sb.append(sum).append("\n").append(answer).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}

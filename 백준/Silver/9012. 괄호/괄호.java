import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {

            boolean isTrue = true;
            String str = br.readLine();

            // 스택 생성 및 초기화
            Stack stack = new Stack(str.length());


            // 괄호 검사
            for(int j = 0; j < str.length(); j++) {

                char ch, open_ch;

                ch = str.charAt(j);

                switch (ch) {
                    case '(':
                        stack.push(ch);
                        break;
                    case ')' :
                        if(stack.isEmpty()) isTrue = false;
                        else {
                            open_ch = stack.pop();
                            if(open_ch == '(' && ch != ')') {
                                isTrue = false;
                            }
                            break;
                        }
                }

            }

            if(!stack.isEmpty() || isTrue == false) System.out.println("NO");
            else System.out.println("YES");

        }
    }
}

class Stack {

    private int top;
    private int size;
    private Character arr [];

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.arr = new Character[this.size];
    }

    public boolean isEmpty() { return (top == -1); }
    public boolean isFull() { return (top == this.size-1); }

    public void push(Character item) {
        if(!isFull()) {
            arr[++top] = item;
        }
    }

    public Character pop() {
        if(!isEmpty()) {
            return (arr[top--]);
        }
        else return 'e';
    }

}
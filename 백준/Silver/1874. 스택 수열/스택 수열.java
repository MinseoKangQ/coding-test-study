import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int num = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack(n);

        for(int i = 1; i <= n; i++) {
            int x = Integer.parseInt(br.readLine());

            for(; num <= x; num++) {
                stack.push(num);
                sb.append("+").append("\n");
            }

            if(x != stack.peek()) {
                System.out.println("NO");
                return; // 프로그램 종료
            }
            else {
                stack.pop();
                sb.append("-").append("\n");
            }
        }

        System.out.print(sb);

    }

}

class Stack {

    int top;
    int size;
    int arr [];

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.arr = new int [size];
    }

    public boolean isEmpty() { return (top == -1); }
    public boolean isFull() { return (top == size-1); }

    public void push(int item) {
        if(!isFull()) {
            arr[++top] = item;
        }
    }

    public int pop() {
        if(!isEmpty()) {
            return arr[top--];
        }
        else return -999;
    }

    public int peek() { return arr[top]; }

}

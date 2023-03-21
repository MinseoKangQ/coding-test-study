import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack stack = new Stack(k);

        for(int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0)  {
                int x = stack.pop();
            }
            else stack.push(num);
        }
        
        System.out.print(stack.getSum());
    }

}

class Stack {

    private int top;
    private int size;
    private int arr [];

    public Stack(int size) {
        top = -1;
        this.size = size;
        arr = new int[this.size];
    }

    public boolean isEmpty() { return (top == -1); }
    public boolean isFull() { return (top == this.size-1); }

    public void push(int item) {
        if(!isFull()) {
            arr[++top] = item;
        }
    }

    public int pop() {
        if(!isEmpty()) {
            return (arr[top--] = 0);
        }
        else return -1;
    }

    public int getSum() {
        int sum = 0;
        for(int x : arr) sum += x;
        return sum;
    }
}
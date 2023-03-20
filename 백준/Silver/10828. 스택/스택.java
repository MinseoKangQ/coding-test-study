import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayStack arrayStack = new ArrayStack(10000);

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {

            String str = br.readLine();

            // push
            if(str.contains("push")) {
                int item = Integer.parseInt(str.substring(5));
                arrayStack.push(item);
            }

            // pop
            if(str.equals("pop")) {
                sb.append(arrayStack.pop()).append("\n");
            }

            // size
            if(str.equals("size")) {
                sb.append(arrayStack.getSize()).append("\n");
            }

            // empty
            if(str.equals("empty")) {
                if(arrayStack.isEmpty()) sb.append("1").append("\n");
                else sb.append("0").append("\n");
            }

            // top
            if(str.equals("top"))
                sb.append(arrayStack.top()).append("\n");
        }

        System.out.print(sb);
    }
}

class ArrayStack {

   private int top;
   private int size;
   private int arr [];

   public ArrayStack(int size) {
       top = -1;
       this.size = size;
       arr = new int[this.size];
   }

   public boolean isEmpty() {
       return (top == -1);
   }

   public boolean isFull() {
       return (top == this.size-1);
   }

   public void push(int item) {
       if(!isFull()) {
           arr[++top] = item;
       }
   }

   public int pop() {
       if(isEmpty()) return -1;
       else return arr[top--];
   }

   public int top() {
       if(isEmpty()) return -1;
       else return arr[top];
   }

   public int getSize() {
       return (top+1);
   }

}
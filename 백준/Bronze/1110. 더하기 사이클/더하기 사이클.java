import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();
        int i = inputNum; // 최초 inputNum을 저장하고 반복문 내에서 사용되는 변수
        int cycle = 0; // 사이클의 길이

        while(true) {
            int sum = (i/10) + (i%10);
            int newNum = (i%10)*10 + (sum%10);
            i = newNum;
            cycle++;
            if(inputNum == newNum) break;
        }

        System.out.println(cycle);

    }

}

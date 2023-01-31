import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 정수 개수 입력 받기

        ArrayList<Integer> arr = new ArrayList<>(N); // N개 만큼의 ArrayList 생성

        for(int i = 0; i < N; i++) { 
            arr.add(scanner.nextInt()); // 요소 입력 받기
        }

        int v = scanner.nextInt(); // 찾으려고 하는 정수 입력 받기
        int numOfV = 0; // 찾으려고 하는 정수의 개수

        for(Integer x : arr) { // 요소에 하나씩 접근하면서
            if(x == v) numOfV++; // v와 동일한지 확인
        }

        System.out.println(numOfV);
    }

}
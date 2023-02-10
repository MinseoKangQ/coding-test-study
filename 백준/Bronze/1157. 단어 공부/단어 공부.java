import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int isIncluded [] = new int [26]; // 알파벳 개수를 세기 위한 배열
        for(int x : isIncluded) x = 0; // 모두 0으로 초기화

        String word = scanner.next(); // 단어 입력받기
        String upperWord = word.toUpperCase(); // 알파벳을 모두 대문자로 바꾸기

        for(int i = 0; i < upperWord.length(); i++) { // 인덱스에 하나씩 접근하면서
           isIncluded[(int)upperWord.charAt(i)-65]++; // 해당되는 알파벳의 값 증가시키기
        }

        int maxIndex = 0;
        for(int i = 0; i < isIncluded.length; i++) {
            if(isIncluded[i] > isIncluded[maxIndex])
                maxIndex = i;
        }

        int secondMaxIndex = 0;
        if(maxIndex == 0) secondMaxIndex = 1;
        for(int i = 1; i < isIncluded.length; i++) {
            if(maxIndex == i) continue;
            else {
                if(isIncluded[i] > isIncluded[secondMaxIndex])
                    secondMaxIndex = i;
            }
        }

        // 출력
        if(isIncluded[maxIndex] == isIncluded[secondMaxIndex])
            System.out.println("?");
        else {
            System.out.println((char)(maxIndex+65));
        }
    }
}

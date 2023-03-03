import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<>();

        int N = Integer.parseInt(br.readLine()); // 단어의 개수 입력받기

        for(int i = 0; i < N; i++) {
            String str = br.readLine(); // 단어 입력받고
            if (!strList.contains(str)) // 해당 단어가 strList에 포함되어 있지 않다면
                strList.add(str); // strList에 넣어주기
        }

        Collections.sort(strList, new Comparator<String>() { // 정렬을 위해
            @Override
            public int compare(String o1, String o2) { // 메소드 재정의
                if(o1.length() > o2.length()) 
                    return 1;
                else if(o1.length() == o2.length()) 
                    return o1.compareTo(o2);
                else return -1;
            }
        });

        for (String s : strList) {
            System.out.println(s);
        }

    }
}
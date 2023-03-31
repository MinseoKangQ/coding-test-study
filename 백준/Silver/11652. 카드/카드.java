import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Integer> map = new HashMap<>();
        ArrayList<Long> arr = new ArrayList<>();

        // 가지고 있는 카드 갯수 입력받기
        int N = Integer.parseInt(br.readLine());

        // map에 넣기
        for(int i = 0; i < N; i++) {
            long x = Long.parseLong(br.readLine());
            if(!map.containsKey(x)) { // 최초로 입력받은 key이면
                map.put(x, 1); // map에 넣기
            }
            else { // 이미 존재하는 key이면
                map.replace(x, map.get(x)+1); // 해당 key의 value에 1을 더하기
            }
        }

        // map을 Set 형태로 list에 넣기
        List<Map.Entry<Long, Integer>> list = new ArrayList<>(map.entrySet());

        // 정렬
        Collections.sort(list, new Comparator<Map.Entry<Long, Integer>>() {

            @Override
            public int compare(Map.Entry<Long, Integer> o1, Map.Entry<Long, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        int maxCount = 0;
        for(Map.Entry<Long, Integer> x : list) {
            maxCount = x.getValue();
            break;
        }

        for(Map.Entry<Long, Integer> x : list) {
            if(x.getValue() == maxCount){
                arr.add(x.getKey());
            }
        }

        Collections.sort(arr);

        System.out.print(arr.get(0));

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        int count = 0;

        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        for(int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st2.nextToken()));
        }

        for(int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st3.nextToken()));
        }

        // A-B
        Iterator<Integer> itA = A.iterator();
        while(itA.hasNext()) {
            if(!B.contains(itA.next())) count++;
        }

        // B-A
        Iterator<Integer> itB = B.iterator();
        while(itB.hasNext()) {
            if(!A.contains(itB.next())) count++;
        }

        System.out.print(count);
    }
}

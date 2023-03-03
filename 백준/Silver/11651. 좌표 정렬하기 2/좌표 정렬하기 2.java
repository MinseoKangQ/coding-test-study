import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(int x, int y) { // 생성자를 통한 좌표 초기화
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){ // 출력을 위한 오버라이딩
        return this.x + " " + this.y;
    }

    @Override
    public int compareTo(Point p) { // 정렬의 기준 오버라이딩
        // 1을 리턴하면 자리 바꿈
        if(this.y > p.y){
            return 1;
        }

        else if (this.y == p.y) {
            if(this.x > p.x)
                return 1;
            else
                return -1;
        }

        else {
            return -1;
        }
    }
}


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> points = new ArrayList<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x, y));
        }

        Collections.sort(points);

        for(Point p : points)
            System.out.println(p);

    }

}
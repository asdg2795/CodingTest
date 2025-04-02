import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            maxX = Math.max(maxX, arr[i][0]);
            minX = Math.min(minX, arr[i][0]);
            maxY = Math.max(maxY, arr[i][1]);
            minY = Math.min(minY, arr[i][1]);
        }

        int result = (maxX - minX) * (maxY - minY);


        System.out.println(result);

    }
}

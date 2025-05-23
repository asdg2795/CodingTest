import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int[][] arr = new int[X][2];

        for(int i = 0; i < X; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(arr, (e1,e2) -> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }else{
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < X; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}

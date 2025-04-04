import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    final static String Equilate = "Equilateral";
    final static String Isosceles = "Isosceles";
    final static String Scalene = "Scalene";
    final static String Invalid = "Invalid";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];

        String result;

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }

            int max = Math.max(arr[0], Math.max(arr[1], arr[2]));

            if(max >= ((arr[0] + arr[1] + arr[2])-max)){
                result = Invalid;
            }else if(arr[0] == arr[1] && arr[1] == arr[2]){
                result = Equilate;
            }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]){
                result = Isosceles;
            }else{
                result = Scalene;;
            }
            System.out.println(result);
        }

    }
}

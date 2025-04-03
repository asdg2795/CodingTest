import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    final static String Equilate = "Equilateral";
    final static String Isosceles = "Isosceles";
    final static String Scalene = "Scalene";
    final static String Error = "Error";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];

        String result;


        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(arr[0] == 60 && arr[1] == 60 && arr[2] == 60){
            result = Equilate;
        }else if(arr[0]+arr[1]+arr[2] == 180 && (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0])){
            result = Isosceles;
        }else if(arr[0] + arr[1] + arr[2] == 180){
            result = Scalene;
        }else{
            result = Error;
        }

        System.out.println(result);
    }
}

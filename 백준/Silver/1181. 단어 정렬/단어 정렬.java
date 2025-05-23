import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        String[] arr = new String[X];
        
        for(int i = 0; i < X; i++){
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }      
        });
            System.out.println(arr[0]);
            
            for(int i = 1; i < X; i++){
                if(!arr[i].equals(arr[i-1])){
                    System.out.println(arr[i]);
                }
            }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        int C = input;
        int cnt = 0;
        
        do{
            int A = C % 10;
            int B = C / 10;
            C = (A*10)+(A+B)%10;
            cnt++;
        }while(C != input);
        
        System.out.println(cnt);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();

        /**
         오늘도 서준이는 점근적 표기 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

         알고리즘의 소요 시간을 나타내는 O-표기법(빅-오)을 다음과 같이 정의하자.

         O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}

         이 정의는 실제 O-표기법(https://en.wikipedia.org/wiki/Big_O_notation)과 다를 수 있다.

         함수 f(n) = a1n + a0, 양의 정수 c, n0가 주어질 경우 O(n) 정의를 만족하는지 알아보자.
         */
        int[] a = new int[2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int num1 = (a[0] * n) + a[1];
        int num2 = c * n;

        if(num1 <= num2 && a[0] <= c){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}

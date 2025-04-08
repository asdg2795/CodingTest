import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int MenOfPassion(int[] A, int n){
        int i = n/2;
        return A[i];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();

        /**
         * 오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
         *
         * 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
         *
         * MenOfPassion 알고리즘은 다음과 같다.
         *
         * MenOfPassion(A[], n) {
         *     i = ⌊n / 2⌋;
         *     return A[i]; # 코드1
         * }
         */

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        MenOfPassion(A, N);

        System.out.println(1);
        System.out.println(0);

    }
}

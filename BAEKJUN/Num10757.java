package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        int len1 = A.length() - 1;
        int len2 = B.length() - 1;
        int remainder = 0 ;
        StringBuilder builder = new StringBuilder();
        while(len1 >= 0 || len2 >= 0) {

            // 문자를 정수형으로 변경.
            // 만약 현재 덧셀할 자리수를 초과 한경우 0 으로 간주한다.
            int c1 = len1 < 0 ? c1 = 0 : A.charAt(len1) - '0';
            int c2 = len2 < 0 ? c2 = 0 : B.charAt(len2) - '0';

            int sum =  c1+c2 + remainder;

            // 자리수를 더한 값에서 몫은 다음 자리수 덧셈을 위해 저장해두고
            // 나머지 값은 문자열에 추가해준다.
            int c = sum%10;
            remainder = sum/10;
            builder.insert(0, c);

            len1--;
            len2--;
        }

        if(remainder > 0) {
            builder.insert(0, remainder);
        }
        System.out.println(builder.toString());
    }
}

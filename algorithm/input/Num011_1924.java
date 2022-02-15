package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num011_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        calender(m, d);
    }

    static void calender(int i, int d) {

        String day = " ";

        int sum = 0;

        for (int m = 1; m < i; m++) {

            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                sum += 31;
            }
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                sum += 30;
            } else {
                sum += 28;
            }

        }
        sum += d;


        switch ( sum%7 ) {
            case 1 :
                day = "MON";
                break;
            case 2 :
                day = "TUE";
                break;
            case 3 :
                day = "WED";
                break;
            case 4 :
                day = "THU";
                break;
            case 5 :
                day = "FRI";
                break;
            case 6 :
                day = "SAT";
                break;
            case 0 :
                day = "SUN";
                break;
        }

        System.out.println(day);
    }
}

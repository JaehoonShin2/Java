package com.algorithmTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num007_11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strlist = new ArrayList<>();
        String str = null;

        for ( int i = 0; i<100; i++) {
            str = br.readLine();
            if (str == null) {
                strlist.add("");
            } else {
                strlist.add(str);
            }
        }
        for (String strr : strlist) {
            System.out.println(strr);
        }
    }
}

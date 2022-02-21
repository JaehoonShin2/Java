package com.algorithmTest;

public class Num024_1463not {


    private static int N = 10;
    static int result = 0;
    public static void main(String[] args) {
        System.out.println(Tree(10, 0));
    }

    static int Tree(int N, int count) {
        if (N < 2) {
            return count;
        }
        return Math.min(Tree(N/2, count+1+(N%2) ),
                Tree(N/3, count+1 +(N%3) )  );
    }

}

package com.kh.variable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num2798 {

		public static void main(String[] args) throws IOException {
	 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	        int N = Integer.parseInt(st.nextToken());
	        // ī���� ����
	        int M = Integer.parseInt(st.nextToken());
	        // ��
	        int[] arr = new int[N];

	        st = new StringTokenizer(br.readLine(), " ");
	        for (int i = 0; i < N; i++) {
	            arr[i] = Integer.parseInt(st.nextToken());
	        }
	        int result = search(arr, N, M);
	        System.out.println(result);

	    }
	    static int search(int[] arr, int n, int m) {
	        int result = 0;
	        // 3�� for��
	        for (int i = 0; i < n - 2; i++) {

	            for (int j = i + 1; j < n - 1; j++) {

	                for (int k = i + 2; k < n; k++) {

	                    int sum = arr[i] + arr[j] + arr[k];

	                    if (sum == m) {
	                        return sum;
	                    }
	                    if (result < sum && sum < m) {
	                        result = sum;
	                    }

	                }
	            }
	        }
	        return result;
	    }
	}
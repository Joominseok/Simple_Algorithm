package com.java.algorithm;

public class Algorithm1 {

	public static void main(String[] args) {
		// 간다한 알고리즘 기초 1부터 100까지의 총합 구하기
		int sum = 0; 
		int i;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 총합 = "+ sum);
	}

}

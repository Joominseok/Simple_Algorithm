package com.java.algorithm;

public class Algorithm2 {

	public static void main(String[] args) {
		// 구구단 출력하기!
		int x; // <- x는 앞자리
		int y; // <- y는 뒷자리
		
		for(x=2; x<=9; x++) {
			System.out.println("구구단 "+x+"단 출력!");
			for(y=1; y<=9; y++) {
				System.out.println(x+" X "+y+" = "+(x*y));
			}
		}

	}

}

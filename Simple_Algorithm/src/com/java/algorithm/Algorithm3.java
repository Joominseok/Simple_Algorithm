package com.java.algorithm;

public class Algorithm3 {

	public static void main(String[] args) {
		// 3,6,9 게임 출력
		for (int count = 1; count <= 100; count++) {
		    String stringCnt = String.valueOf(count); //int타입을 string타입 문자열 변환
		    boolean isChark = false; // 3 6 9 해당여부 저장
		    for (int i = 0; i < stringCnt.length(); i++) {
		    	//charAt(인덱스) (문장중에 인덱스 위치에 해당되는 문자 추출하기)
		        char chk = stringCnt.charAt(i);
		        /*    
                 * 형변환된 문자열의 index 값을 찾는다. 100 의 index 범위 0~2
                 * 예를 들어 strCnt = 99 값이 되었을때
                 * stringCnt.charAt(0) = 9
                 * stringCnt.charAt(1) = 9
                 * 박수는 2번 이루어 진다.
                */
		        // 해당 수의 앞에서부터 i번째 숫자부터 검사
		        if (chk == '3' || chk == '6' || chk == '9') {
		            // 3 6 9 해당되면 짝 출력
		            System.out.print('짝');
		            isChark = true;
		        }
		    }
		    if (!isChark) {
		        // 3 6 9 해당 되지 않았다면 수 표시
		        System.out.print(stringCnt);
		    }
		    if (count % 10 == 0) {
		        // 10 단위로 줄바꿈
		        System.out.println();
		    } else {
		        // 중간수면 한 칸 띄우기
		        System.out.print(' ');
		    }
		}

	}

}

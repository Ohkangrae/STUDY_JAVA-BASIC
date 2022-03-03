package pm;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		
		
		// int mon = 7;
		// 사용자로 부터 월을 직접 입력 받아서
		// 해당 월을 영어로 출력하시오 단 switch 구문을 사용하시오
		// Jan, Feb, Mar, Apr ..
		
		// import 방법 ctrl-shift-o	여러개를 모두 import
		// 			  ctrl-space	해당 라이브러리만 import
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("월을 입력하세요 >>>");
//		int mon = sc.nextInt();
//		
//		switch(mon) {
//		case 1:{
//			System.out.println("Jan");
//			break;}
		
		
		// 반복문 for
		// 실행 구문을 반복적으로 수행하는 반복 제어문으로 일반적으로 반복 횟수가 정확할때
		// 주로 사용된다. 즉, for문의 구문을 보면 몇번 반복할지 유추할수 있어야한다.
		
//		for(start; stop; step) {
//			
//		}
		
		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		
//		int j;
//		for (j=0; j<=10; j++) {
//			System.out.println(j);
//		}
		
//		for(int i = 0, j = 0 ; i < 10 ; i++, j++) {
//			System.out.println(i+j+" ");
//		}
		
		
		
//		for 문에서의 무한루프
//		for (int i = 0 ;  ; i++) {
//			System.out.println(i + " ");
//		}
		
//		for ( ; ; ) {
//			System.out.println("무한루프");
//		}
		
		
		
		// 이중 for문
		
		for(int i = 1; i <= 3 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.println(i + "일차" + j + "교시");
			}
		}
		
		
		// for each
		// array 배열
		
		
//		String name = "오강래";  변수 1개에 데이터 1개 저장
		String[] names = {"홍길동","이몽룡","성춘향"};
		int[] numbers = {1,2,3,4,5};
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
		
		
		
		
		

	}

}

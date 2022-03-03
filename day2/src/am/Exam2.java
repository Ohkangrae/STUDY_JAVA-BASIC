package am;

import java.util.Calendar;

public class Exam2 {

	public static void main(String[] args) {
/*
 연산자의 종류
 산술 연산자 + - * / % 
 증감 연산자 	++, --		i = i + 1,  i =+ 1, i++
 비트 연산자 & (and) | (or)
 비교 연산자 <, >, <=, >=, ==, !=
 대입 연산자 =   +=  -=  *=  /=
 삼항 연산자 (조건식) ? true : false
*/

//		int a = 1;
//		a= a+1;
//		a += 1;
//		a++; (후위형)
//		++a; (전위형)
//		System.out.println(a);
		
		
//		int a = 3;
//		int b = ++a;			// a값을 하나 증가 시킨 후의 값을 b에 대입
//		System.out.println(a);	//4
//		System.out.println(b);	//4
//		
//		int c = 3;
//		int d = c++;			
//		System.out.println(c);	//4
//		System.out.println(d);	//3
		
		
		// 삼항연산자 : 3개의 피연산자가 있는 연산자
		// (조건식) ?  true : false
		
//		int a = (true) ? 1 : 2;
//		int a = (false) ? 1 : 2;
//		System.out.println(a);
//		
//		int b = (a % 2 == 0) ? 10 : 20;
//		System.out.println(b);
		
		
//		int a = 2;
//		int b;
//		if (a % 2 == 0) {
//			b=10;
//		}else {
//			b=20;
//		}
//		System.out.println(b);
		
		
//		int value = 3;
//		System.out.println((value % 2 == 0) ? "짝수" : "홀수");
		
		
		//삼항 연산자를 사용하여 90이상이면 A, 80 B 70 C 60 D 나머지 전부 F로 출력 
//		int score = 85;
//		System.out.println((score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F');
		
		// hour에는 현재 시간이 24시간 단위로 들어있습니다. 
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항 연산자를 이용해 ampm에 오전 또는 오후의 값을 가지도록 만들어보세요.
        ampm = (hour >=12 ? "pm" : "am");
        System.out.println("지금 시간은 "+hour+"시이고, "+ampm+"입니다.");
		
		
		
		
		

	}

}

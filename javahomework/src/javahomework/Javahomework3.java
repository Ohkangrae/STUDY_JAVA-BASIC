package javahomework;

import java.util.Scanner;

public class Javahomework3 {

	public static void main(String[] args) {
		// 3-15
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 a:");	int a = sc.nextInt();
//		System.out.println("정수 b:");	int b = sc.nextInt();
//		System.out.println("정수 c:");	int c = sc.nextInt();
//		
//		int min = a;
//		if(b<min)min = b;
//		if(c<min)min = c;
//		
//		System.out.println("최솟값은"+min+"입니다.");
		
		
		
		
		//3-21
//		Scanner cs = new Scanner(System.in);
//		System.out.println("몇 월입니까?");
//		int r = cs.nextInt();
//		
//		if(r>=3&r<=5) {
//			System.out.println("봄입니다.");
//		}
//		else if(r>=6&r<=8) {
//			System.out.println("여름입니다.");
//		}
//		else if(r>=9&r<=11) {
//			System.out.println("가을입니다.");
//		}
//		else if(r==12&r==1&r==2) {
//			System.out.println("겨울입니다.");
//		}
//		else {
//			System.out.println("그런 월은 없습니다.");
//		}
		
		Scanner cs = new Scanner(System.in);
		System.out.println("몇 월입니까?");
		int month = cs.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5: System.out.println("봄");	break;
		case 6:
		case 7:
		case 8: System.out.println("여름");	break;
		case 9:
		case 10:
		case 11: System.out.println("가을");	break;
		case 12:
		case 1:
		case 2: System.out.println("겨울");	break;
		default: System.out.println("그런 월은 없습니다.");	break;
		}
		
		
		
		//4-14
		
//		Scanner scc = new Scanner(System.in);
//		int h = scc.nextInt();
//		for(int i = 1; i<h ;i++);
//		sum += i;
//			System.out.println("1부터"+h+"까지의 합은"+sum+"입니다.");
		
		
		//4-21
		
//		Scanner scsc = new Scanner(System.in);
//		int w = scsc.nextInt();
//		for(int i=1;i<=w;i++) {
//			for(int j=1;j<=w;j++) {
//				System.out.print("*");
//			}
//		}
		
		
		
		
		

	}

}

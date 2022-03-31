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
		
		
		
		
		//3-21 오답
//		Scanner cs = new Scanner(System.in);
//		System.out.println("몇 월입니까?");
//		int r = cs.nextInt();
//		
//		if(r>=3&&r<=5) {
//			System.out.println("봄입니다.");
//		}
//		else if(r>=6&&r<=8) {
//			System.out.println("여름입니다.");
//		}
//		else if(r>=9&&r<=11) {
//			System.out.println("가을입니다.");
//		}
//		else if(r==12&&r==1&&r==2) {
//			System.out.println("겨울입니다.");
//		}
//		else {
//			System.out.println("그런 월은 없습니다.");
//		}
		
		
		//3-21
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
		
		
		
		//4-2
		
		Scanner scscsc = new Scanner(System.in);
		int x;
		do {
			System.out.println("세 자리의 정숫값:");
			x = scscsc.nextInt();
		}while(x<100 || x>999);
		
		System.out.println("입력한 값은" + x + "입니다.");
		
			
		
		//4-14 답 이상함
		
//		Scanner scc = new Scanner(System.in);
//		System.out.print("1부터 n까지의 합을 구합니다.");
//		int n;
//		do {
//			System.out.println("n의 값:");
//			n = scc.nextInt();
//		}while(n<=0);
//		
//		int sum = 0;
//		for(int i = 0;i<=n;i++)
//			sum +=1;
//		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
		
		
		//4-21
		
		Scanner scsc = new Scanner(System.in);
		System.out.println("정방형을 표시합니다.");
		System.out.print("단수는 : ");
		int w = scsc.nextInt();
		for(int i=1;i<=w;i++) {
			for(int j=1;j<=w;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		
		

	}

}

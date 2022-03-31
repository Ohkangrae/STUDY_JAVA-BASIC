package javahomework;

import java.util.Random;
import java.util.Scanner;

public class Javahomework2 {

	public static void main(String[] args) {
		//2-11
		
		Random rand = new Random();
		
		int a = 1 + rand.nextInt(9);
		int b = -1 - rand.nextInt(9);
		int c = 10 + rand.nextInt(90);
		//nextInt(랜덤으로 올수있는 숫자의 가짓수)
//		0부터 세기 때문에 0,1,..,8
//		0부터 89까지 하고 +10
		
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("한 자리 양의 정수 : "+a);
		System.out.println("한 자리 음의 정수 : "+b);
		System.out.println("두 자리 양의 정수 : "+c);
		
		
		
		
		//2-14
		Scanner sc = new Scanner(System.in);
//		
		System.out.print("성:");
		String lastName = sc.next();
		System.out.print("이름:");
		String firstName = sc.next();
//		
		System.out.print("안녕하세요."+lastName+firstName+"씨.");
		
		
		System.out.println();
		
	//3-3	
		Scanner scan = new Scanner(System.in);
				
			System.out.println("변수 A:"); int y = scan.nextInt();
			System.out.println("변수 B:"); int z = scan.nextInt();
		
		
			if(y%z==0)
				System.out.println("B는 A의 약수입니다.");
			else
				System.out.println("B는 A의 약수가 아닙니다.");
		
	//3-5	
		Scanner sca = new Scanner(System.in);
			
			System.out.println("정숫값 : "); int g = sca.nextInt();
			if(g == 0)
				System.out.println("값이 0입니다.");
			else if(g > 0)
				System.out.println("값이 양수입니다.");
			else
				System.out.println("값이 음수입니다.");
			
	//3-7		
		Scanner cs = new Scanner(System.in);
		System.out.println("변수 r :");	int r = cs.nextInt();
		System.out.println("변수 t :");	int t = cs.nextInt();
			
		if(r==t)
			System.out.println("r와t가 같다.");
		else if(r>t)
			System.out.println("r이 크다.");
		else
			System.out.println("t가 크다.");
			
			

	}

}

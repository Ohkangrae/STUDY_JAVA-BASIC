package javahomework;

import java.util.Scanner;

public class Javahomework1 {

	public static void main(String[] args) {
		//1-5
		System.out.println("홍\n\n"+"길\n"+"동");
		System.out.println();
		System.out.println("홍");
		System.out.println("");
		System.out.println("길");
		System.out.println("동");
		
		System.out.println();
		
		//2-2
		int x = 63;
	    int y = 18;
	    System.out.println("x값은 "+ x+"입니다.");
	    System.out.println("y값은 "+ y+"입니다.");
	    System.out.println("합계는 "+ (x+y)+"입니다.");
	    System.out.println("평균은 "+((x+y)/2)+"입니다.");   
		
		System.out.println();
	    
		//2-5
	    Scanner sc = new Scanner(System.in);
	    System.out.print("정숫값:");
		int a = sc.nextInt();
		System.out.println(a+" 를 입력했습니다.");
		
		System.out.println();
		
		//2-6
		Scanner scan = new Scanner(System.in);
		System.out.print("정숫값:");
		int b = scan.nextInt();
		System.out.println("10을 더한 값은 " +(b+10)+ "입니다.");
		System.out.print("10을 뺀 값은 " +(b-10)+ "입니다.");
		
		System.out.println();
		
		//2-7
		Scanner scsc = new Scanner(System.in);
		System.out.println("정숫값:");
		int c = scsc.nextInt();
		
		System.out.println("마지막 자릿수를 제외한 값은"+(c/10)+"입니다.");
		System.out.println("마지막 자릿수는"+(c%10)+"입니다.");
		
		

	}

}

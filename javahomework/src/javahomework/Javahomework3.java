package javahomework;

import java.util.Scanner;

public class Javahomework3 {

	public static void main(String[] args) {
		// 3-15
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a:");	int a = sc.nextInt();
		System.out.println("정수 b:");	int b = sc.nextInt();
		System.out.println("정수 c:");	int c = sc.nextInt();
		
		int min = a;
		if(b<min)min = b;
		if(c<min)min = c;
		return min;
		
		
		
		
		//4-14
		
		Scanner scc = new Scanner(System.in);
		int h = scc.nextInt();
		for(int i = 1; i<h ;i++);
			sum += i;
			System.out.println("1부터"+h+"까지의 합은"+sum+"입니다.");
		
		
		
		

	}

}

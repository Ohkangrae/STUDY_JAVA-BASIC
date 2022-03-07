package pm;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		//
		// 숫자를 하나 입력받아서 0인지의 여부를 판단하는 프로그램을 만드세요
		// 입력하신 숫자는 0입니다.....입력하신 숫자는 0이 아닙니다.

//		 1) if else
//	     2) without if else

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 하나 입력하세요");
//		int inp = sc.nextInt();
//		
//		if(inp == 0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//		} else {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//		}

		// 임진석

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		String ans = (num == 0) ? "입력하신 숫자는 0입니다." : "입력하신 숫자는 0이 아닙니다.";
//		System.out.println(ans);

		// 90점 이상이면 A 80점 이상이면 B .....
		// 97점 이상이면 A+, 93점 이하 A-, 나머지는 A 94 95 96

		// (input) 점수를 입력해주세요 >>> 81
		// (output)당신의 점수는 81점이고 학점은 B-입니다. <- 이구문은 딱 한번만 나오게

		// 중복 되는 코드를 최대한 줄일것.

//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력해주세요 >>> ");
//		int num = sc.nextInt();
//		
//		char grade = ' ', opt = ' ';
//				
//		if (num >= 90) {
//			grade = 'A';
//			if (num >= 97) {
//				opt = '+';
//			} else if (num < 94) {
//				opt = '-';
//			}
//		} else if (num >= 80) {
//			grade = 'B';
//			if (num >= 87) {
//				opt = '+';
//			} else if (num < 84) {
//				opt = '-';
//			}
//		} else if (num >= 70) {
//			grade = 'C';
//			if (num >= 77) {
//				opt = '+';
//			} else if (num < 74) {
//				opt = '-';
//			}
//		} else if (num >= 60) {
//			if (num >= 67) {
//				opt = '+';
//			} else if (num < 64) {
//				opt = '-';
//			}
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
//		
//		System.out.printf("당신의 학점은 %c%c입니다. \n", grade, opt);
//		

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 >>> ");
		int num = sc.nextInt();

		char grade = ' ', opt = ' ';

		if (num >= 90) {
			grade = 'A';

		} else if (num >= 80) {
			grade = 'B';

		} else if (num >= 70) {
			grade = 'C';

		} else if (num >= 60) {
			grade = 'D';

		} else {
			grade = 'F';
		}

		
		if (num == 100) {
			opt = '+';
		} else if(num <= 59) {
			opt = ' ';
		} else if(num % 10 >= 7) {
			opt = '+';
		} else if (num % 10 <= 3) {
			opt = '-';
		}

		System.out.printf("당신의 학점은 %c%c입니다. \n", grade, opt);

	}
}
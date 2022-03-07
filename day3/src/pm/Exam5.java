package pm;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 가위바위보 게임
		//input) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >>>
		// 당신은 1입니다. 
		// 컴은  1입니다. 
		// 비겼습니다. 
		//input) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >>>
		// 당신은 3입니다. 
		// 컴은  2입니다. 
		// 당신이 이겼습니다.		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >>>");
//		int pers = sc.nextInt();
//		int comp = (int)(Math.random() * 3) + 1; // 1,2,3 중 하나가 comp 로 저장
//		
//		switch(pers-comp) {
//		case 0:
//			System.out.println("비겼습니다.");
//			break;
//		case 2: case -1: //컴승: 컴1  사3   2 , 컴2  사1,    -1   컴3 사2   -1
//			System.out.println("당신이 졌습니다.");
//			break;
//		case 1: case -2:
//			System.out.println("당신이 이겼습니다.");
//			break;
//			
//		}

		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요  >>> ");
//		int choice = sc.nextInt();
//		int comp = (int)(Math.random() * 3) +1;
//		String ans =" ";
//		switch(choice) {
//		case 1: ans = (comp == 2) ? "당신이 졌습니다." : (comp == choice) ? "비겼습니다." : "당신이 이겼습니다."; break;
//		case 2: ans = (comp == 3) ? "당신이 졌습니다." : (comp == choice) ? "비겼습니다." : "당신이 이겼습니다."; break;
//		case 3: ans = (comp == 1) ? "당신이 졌습니다." : (comp == choice) ? "비겼습니다." : "당신이 이겼습니다.";
//		}
//		System.out.printf("당신은 %d입니다.\n컴은 %d입니다.\n%s", choice,comp,ans);
//
//		
		
		
//		Scanner sc = new Scanner(System.in);
//	      System.out.println("점수를 입력하세요 >>> ");
//	      int number = sc.nextInt();
//	      int score = number/10; //점수 앞자리 수 파악
//	      int score2 = number %10;
//	      if (score > 5) {
//	         String[] list =  {"D","C","B","A"};
//	         String[] list2 =  {"-","-","-","0","0","0","+","+","+"};
//	         System.out.println("당신의 점수는  " +number+" 이고 학점은 "+ list[score-6]+list2[score2-1]+" 입니다.");
//	      } System.out.println("당신의 점수는  " +number+" 이고 학점은  F입니다.");

//	      2개의 변수 a,b를 입력 받아서 대소관계를 표시하는 프로그램을 작성하시오
//	      a가 크다, b가 크다 , 같다. 
//	      without if
	      
			
//		  Scanner sc = new Scanner(System.in);
//		  
//	      System.out.print("숫자 a 입력 >>> ");
//	      int a = sc.nextInt();
//	      System.out.print("숫자 b 입력 >>> ");
//	      int b = sc.nextInt();
//	      
//	      String max = (a == b) ? "같다" : a > b ? "a가 크다" : "b가 크다";
//	      System.out.println(max);
	      
	      //사용자로 부터 3개의 정수를 입력받아 그중 최소값을 출력하는 프로그램을 작성하자. 
	      
//		  Scanner sc = new Scanner(System.in);
//		  
//	      System.out.print("숫자 a 입력 >>> "); int a = sc.nextInt();
//	      System.out.print("숫자 b 입력 >>> "); int b = sc.nextInt();
//	      System.out.print("숫자 c 입력 >>> "); int c = sc.nextInt();
//	      
//	      int min = a;
//	      if(b < min) min = b;
//	      if(c < min) min = c;
//	      
//	      System.out.println("최소값 : " + min);
	      
	      //3개의 정수값을 입력받아 오름차순으로 정렬하는 프로그램을 작성하세요
//		   13  12  11    ->     11  12  13
		   // array arraylist 사용 금지
		
//		  Scanner sc = new Scanner(System.in);
//		  
//	      System.out.print("숫자 a 입력 >>> "); int a = sc.nextInt();
//	      System.out.print("숫자 b 입력 >>> "); int b = sc.nextInt();
//	      System.out.print("숫자 c 입력 >>> "); int c = sc.nextInt();
////                                 13 12 11     2  3  1
//	      // a가 b보다 크면 a와 b를 교환    12 13 11     2  3  1
//	      if (a > b) {int t = a; a = b; b = t;}
//	      // b가 c보다 크면 b와 c를 교환    12 11 13     2  1  3
//	      if (b > c) {int t = b; b = c; c = t;}	      
//	      // a가 b보다  크면 a와 b를 교환   11 12 13     1  2  3
//	      if (a > b) {int t = a; a = b; b = t;}	      
//	      
//	      System.out.println(a + " " + b + " " + c);
//		
//	      
	      

	}

}
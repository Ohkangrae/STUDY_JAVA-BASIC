package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
	      // 3자리의 양의 정수값 (100~999)을 읽는 프로그램을 작성하세요
	      // 입력한 값이 3의 양의 정수가 아니면 다시 입력하게 하세요. do~ while 을 사용하세요 if는 사용 금지
	      
	      // 세자리의 정수 >>> 59
	      // 세자리의 정수 >>> 2222
	      // 세자리의 정수 >>> 333
	      // 입력한 값은 333입니다.
	      
//		  Scanner sc = new Scanner(System.in);
//		  
//		  int a;
//		  
//		  do {
//		  
//		      System.out.print("세자리 정수 입력 >>> "); 
//		      a = sc.nextInt();
//	     
//		  }while(a < 100 || a > 999);
//		  	
//		  	System.out.println("입력한 값은" + a + "입니다.");
//		  	
		  	
	//박진욱	  	
//		  	Scanner sc = new Scanner(System.in);
//			String chk = "";
//			do {
//				chk = "";
//				System.out.println("세자리의 정수 >>> ");
//				int num = sc.nextInt();
//				chk += num;
//			}while(chk.length() != 3);
//			
//			System.out.println("입력한 값은 "+ chk+"입니다");
	
		  	
	//이지은
		
//		Scanner sc = new Scanner(System.in);
//		String res = "";
//		boolean b = true;
//		do{
//			
//			System.out.println("세자리의 정수를 입력하시오");
//			int num = sc.nextInt();
//			res = (num>=100 && num<=999) ? "입력한 값은" +num+ "입니다." : "다시 입력하세요";
//			System.out.println(res);
//			b = (res=="다시 입력하세요") ? true : false;
//
//		}while(b);
  	
		  	
		  	
		
//		숫자 맞추기 게임   do ~ while
//		10부터 99 사이의 숫자를 맞추세요  // 난수 발생
//		Random rand = new Random();
//      int no = 10 + rand.nextInt(90);  // 10~ 99사이로 난수 발생
//		어떤 숫자일까요?
//		더 큰 숫자입니다.
//		어떤 숫자일까요?
//		더 작은 숫자입니다.
//		어떤 숫자일까요?
//		정답입니다.
		
	//박진욱
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("10부터 99사이의 숫자를 맞추세요! ");
		int rnd = 10 + rand.nextInt(90);
		int ans;
		do {
			System.out.print("어떤 숫자일까요? >> ");
			ans = sc.nextInt();
			if (rnd > ans){
				System.out.println("더 큰 숫자입니다.\n");
			}else if(rnd<ans) {
				System.out.println("더 작은 숫자입니다.\n");
			}
		}while(rnd != ans);
		System.out.println("정답입니다.");

		  	
	}

}
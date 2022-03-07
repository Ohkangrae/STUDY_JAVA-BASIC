package am;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// Break 제어 키워드

		// break는 if구문을 제외한 {}를 탈출하는 제어 키워드이다.
		// 일반적으로반복문에서 특정 조건을 만족하는 경우 반복문을
		// 탈출하는데 사용된다.

//		for(int i = 0 ; i < 10 ; i++) {
//			if( i == 5) {
//				break;
//			} // if구문으로 break키워드를 실행할 조건을 설정
//			System.out.println(i);
//		} //break 로 탈출하게되는 중괄호

		// 꼭 기억해야하는 점은 break를 이용해 탈출하는 것은 if문을
		// 제외한 가장 가까운 중괄호라는 것이다. 따라서 만약 이중으로
		// 중복된 for 문에서 break를 사용할 경우 안쪽 for문만 탈출
		// 하게 된다.

//		for(int i = 0 ; i < 10 ; i++) {
//			for (int j = 0 ;  j < 10 ; j++ ) {
//				if( j == 3) {
//					break;
//				}
//			System.out.println(i + " " + j);
//			} 	// break로 탈출하게되는 중괄호
//		}

		// j가 3이되면 break로 탈출하게되는 반복문은 안쪽의 for이다.
		// 탈출을 한 뒤에도 바깥쪽 for 문 내부에 있기 때문에 i값의
		// 변화에 따른 반복은 여전히 유효하게 된다.

		// 그렇다면 한번에 모든 반복문을 탈출하는 방법은 없을까...

//		for(int i = 0 ; i < 10 ; i++) {
//			for (int j = 0 ;  j < 10 ; j++ ) {
//				if( j == 3) {
//					i = 100;
//					break;
//				}
//			System.out.println(i + " " + j);
//			} 	// break로 탈출하게되는 중괄호
//		}

//		out:  //위치 지정 레이블
//		for(int i = 0 ; i < 10 ; i++) {
//			for (int j = 0 ;  j < 10 ; j++ ) {
//				if( j == 3) {
//					break out;
//				}
//			System.out.println(i + " " + j);
//			} 	// break로 탈출하게되는 중괄호
//		}

		// break out은 out레이블이 위치해 있는 바깥 쪽 for문을
		// 완전히 탈출하라는 의미가 된다.

		// continue 제어 키워드
		// 반복과정에서 특정 구문을 실행하지 않고 건너뛰는 용도로 사용된다.

//	for (int i = 0 ; i < 10 ; i++) {
//		if( i % 2 != 0 )
//			continue;
//		System.out.print(i + " ");
//	}

//	for (int i = 0 ; i < 5 ; i++) {
//		for (int j = 0 ; j < 5 ; j++) {
//			if(j == 3) {
//				continue;
//			}
//			System.out.println(i + ", " + j);
//		}
//	}
//	

//	for(int i = 10; i > 0;i -= 2) {
//		System.out.println(i);
//	}

		// while

//	int i = 10;
//	while (i > 0) {
//		System.out.println(i);
//		i -= 2;
//	}

//	for(int i = 0 ; i < 5 ; i++ ) {
//		for (int j = 0 ; j < 3; j++) {
//			if(i == 2) {
//				continue;
//			}
//			if(j == 1) {
//				break;
//			}
//			System.out.println("A");
//		}
//	}

//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.println(i +" "+j);
//			}
//		}
//		
		
		//#1 레이블을 사용하여 i = 3, j = 2일때 이중for문을
		// 한번에 탈출하는 코드를 완성하세요
//		out:
//	        for ( int i = 0; i< 10;i++) {
//	            for (int j = 0; j< 5; j++) {
//	                if (i==3&j==2) {
//	                    break out;
//	            
//	                }
//
//	                System.out.println(i + " " + j);
//	            }
//	        }

		
	//메뉴 선택
//	1) 빅맥
//	2) 타코
//	3) 백반
//   원하는 메뉴를 선택하세요 (종료: 0)
//   선택하신 메뉴는 ?번입니다. 
//   메뉴를 잘못 선택하셨습니다.(종료: 0)
//	1) 빅맥
//	2) 타코
//	3) 백반
// 원하는 메뉴를 선택하세요 (종료: 0)
// 
// 프로그램을 종료합니다.
// continue, break 를 사용할 것
		   
//   Scanner sc = new Scanner(System.in);
//   System.out.println("원하는 메뉴를 선택하세요");
//   int menu = sc.nextInt();
//   
//   System.out.println(menu);
		
   
   // 나기업
//		String [] menu = {"품절","빅맥", "타코", "백반"};
//	    out:
//	    while(true) {
//	    	System.out.println("원하는 메뉴를 선택하세요 0)품절 1)빅맥  2)타코  3)백반");
//	    	Scanner sc = new Scanner(System.in);
//	    	int i = sc.nextInt();
//	    	if(i > 3) {
//	    	System.out.println("메뉴를 잘못선택하셨습니다");
//	    	continue;
//	    	}	    		
//	    	System.out.println("선택하신 메뉴는" + menu[i]);
//	    	if (i == 0) {
//	    		System.out.println("프로그램을 종료합니다");
//	    		break out;
//
//	    	}
//   
//	    }
   
		//서민성
		
//		while(true) {
//			System.out.println("원하는 메뉴를 선택하세요");
//			System.out.println("메뉴선택");
//			System.out.println("1)빅맥");
//			System.out.println("2)팝콘");
//			System.out.println("3)백반");
//			Scanner sc = new Scanner(System.in);
//			int menu = sc.nextInt();
//			
//			if (menu == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break ;
//			}
//			if(menu <0 || menu >3){
//				System.out.println("메뉴를 잘못 선택하셨습니다(종료:0)");
//			}
//			
//			if( menu <= 3) {
//				System.out.printf("선택하신 메뉴는 %d번 입니다%n", menu);
//				//continue;
//			}
//	
//		}
		
		
//이지은
		
//		Scanner sc = new Scanner(System.in);
//		String msg= "1)빅맥\n2)타코\n3)백반\n원하는 메뉴를 선택하세요(종료:0)";
//		int ans;
//		while (true) {
//			System.out.println(msg);
//			ans = sc.nextInt();
//			
//			if (ans==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			else if (ans<=3) {
//				System.out.println("선택하신 메뉴는"+ ans +"번 입니다.");
//				//continue;
//			}
//			else {
//				System.out.println("메뉴를 잘 못 선택하셨습니다.");
//			}
//		}

		
		//민병현
		stop:
        while (true){
            System.out.println("1.빅맥");
            System.out.println("2.타코");
            System.out.println("3.백반");

            System.out.println("메뉴를 선택하세요(0번은 종료)");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 0 : break stop;
                case 1 : System.out.println("빅맥을 주문하였습니다"); continue;
                case 2 : System.out.println("타코을 주문하였습니다"); continue;
                case 3 : System.out.println("백반을 주문하였습니다"); continue;
                default : System.out.println("없는 번호입니다");
            }
        }
        System.out.println("프로그램을 종료합니다");
    


		
		
		
	}

}
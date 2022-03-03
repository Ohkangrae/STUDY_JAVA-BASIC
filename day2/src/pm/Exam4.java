package pm;

public class Exam4 {

	public static void main(String[] args) {
		
//		int a = 85;
//		if(a >= 70 && a < 80) {
//			System.out.println("C학점");
//		} else if ( a >= 80 && a < 90) {
//			System.out.println("B학점");
//		} else if ( a >= 90) {
//			System.out.println("A학점");
//		} else  {
//			System.out.println("F학점");
//		}
		
		
//		int a = 85;
//		if(70 <= a < 80) {
//		//자바에서는 반드시 각각을 분리하고 논리 연산자로 연결해야만 한다.
//			System.out.println("C학점");
//		} else if ( a >= 80 && a < 90) {
//			System.out.println("B학점");
//		} else if ( a >= 90) {
//			System.out.println("A학점");
//		} else  {
//			System.out.println("F학점");
//		}
		
		
//		int a = 85;
//		if(a >= 70 & a < 80) {		// & 하나 있을 때
//			System.out.println("C학점");
//		} else if ( a >= 80 & a < 90) {
//			System.out.println("B학점");
//		} else if ( a >= 90) {
//			System.out.println("A학점");
//		} else  {
//			System.out.println("F학점");
//		}
		
		
		
//		int a = 1;
//		int b = 2;
		
		// 효율성 		& | 를 하나만 사용하면 모든 조건을 모두 확인하여 결정한다.
		//			&& || 를 두개를 사용하면 조건을 전부 확인하지 않고 하나만으로도 결정한다.
//		논리 연산자는 비트 연산자와 매우 비슷하지만 피연산자로 블리언(true or false)
//		만 올 수 있고 연산 결과 또한 블리언 타입만을 지닌다. 논리 and(&&)는 두 값이 모두
//		true 일때만 true 나머지는 모두 false값을 가진다 반면 논리 or ||는
//		두 값이 모두 false 일때만 false이고 나머지는 모두 true이다. 
		
//		if (a < 3 && b < 3) {
//			System.out.println("둘다 3 미만입니다.");
//		}else {
//			System.out.println("둘다 3 미만이 아닙니다.");
//		}
		
		
		// switch 구문
		// switch 는 변수값에 따라서 특정위치 case 로 이동해서 구문을 길행하는
		// 선택 제어문이다.
		
		
//		int a = 2;
//		switch(a) {
//		case 1:
//			System.out.println("A");
//			break; // break 를 만나면 구문을 빠져 나간다.
//		case 2:
//			System.out.println("B");
//			break;
//		case 3:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("0");
//		}
		
		
		
		
//		int a =8;
//		switch(a) {
//		case 10:
//			System.out.println("pass");
//			break;
//		case 9:
//			System.out.println("pass");
//			break;
//		case 8:
//			System.out.println("pass");
//			break;
//		case 7:
//			System.out.println("pass");
//			break;
//		default:
//			System.out.println("fail");
//		
//		}
		
		
		// 줄이기
//		int a =8;
//		switch(a) {
//		case 10:case 9:case 8:case 7:
//			System.out.println("pass");break;
//		default:
//			System.out.println("fail");
//		}
		
		
		
//		int a = 8;
//		if (a==8){
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//		}
		
		
//		int a = 8;
//		if (a<11 && a>6){System.out.println("pass");}
//		else {System.out.println("fail");}
		
		
		
		
		int mon = 3;
		switch(mon/3) {
		case 1:System.out.println("봄입니다.");break;
		case 2:System.out.println("여름입니다.");break;
		case 3:System.out.println("가을입니다.");break;
		default:System.out.println("겨울입니다.");
		}
		
		
		
		
	}

}

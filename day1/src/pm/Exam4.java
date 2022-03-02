package pm;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형
		// 변수 선언과 함께 값 대입
		int a = 3;
		
		int b;
		b = 4;
		
		System.out.println(a);
		System.out.println(b);
		
// 변수명 짓기
// 1. 영문 대소 문자와 한글도 사용할 수 있다. (한글은 사용하지 말자)
// 2. 특수 문자는 밑줄_과 달러$ 만 사용할 수 있다. ($abc,_abc, #abc(x))
// 3. 숫자는 사용할 수 있으나 첫글자로는 사용할 수 없다. (a3(o),3a(x))
// 4. 예약어는 사용할 수 없다. (int(x), public(x))
// *. 영문소문자를 사용하자. 의미있는 단어를 사용하자.
//	    여러 단어를 사용할때는 두번째 단어 부터는 첫글자를 대문자로 하자.
//	  myWork, maxValue, bestLocation
		
		boolean aBcD; //대문자는 새로운 단어의 앞글자로 사용하자
		byte 가나다;	  // 한글 변수명도 사용은 가능하지만 비추
		short _abvd;  // _로 시작할 수 있다.
		char $ab_cd;  // $로 시작할 수 있다.
		// int 3abc;  // 숫자로 시작할 수 없다.
		long abcd3;
		// float int; // 예약어 int 는 사용할 수 없다.
		// double main; //예약어  main은 사용 할 수 없다.
		String myClassName; //두번째 부터 단어의 첫글자는 대문자
		String ABC; //사용은 가능하지만 비추( 전부 대문자)
		
		// 변수의 범위...
		// 변수의 생존 기간은 메모리에 변수가 만들어진 이후 사라지기까지의
		// 기간으로 볼 수 있다. 자바는 개발자가 직접 변수를 생성한다. 하지만
		// 변수를 삭제하는 작업은 자바가 알아서 한다. 변수를 삭제하는 주체가
		// 개발자가 아니기 때문에 메모리에서 변수가 사라지는 시점을 이해하는
		// 것은 중요하다.
		// 만약 사라진 변수값을 읽거나 대입하려고 하면 문법 오류가 발생한다.
		
		
	}

}

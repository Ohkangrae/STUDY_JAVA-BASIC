package pm;

public class Exam6 {

	public static void main(String[] args) {
/*
 접근 지정자 modifier 클래스, 필드, 매서드,생성자 등에게 특징을 부여하는
 문법 요소이다. 
 예를들면 다른 패키지에서도 클래스를 사용할 수 있도록 하기위해서는 public
 클래스로 선언을 했다.
 
  맴버와 생성자 에는 public > protected > ()default > private
 4가지 종류의 접근 지정자를 사용할수 있다. 아무것도 적용하지않으면 default가
 자동으로 적용된다. 
 
 public     동일 패키지의 모든 클래스     다른패키지의 모든 클래스에서 사용가능
 protected  동일 패키지의 모든 클래스     다른패키지의 자식 클래스에서 사용가능
 default    동일 패키지의 모든 클래스에서만 사용 가능
 private    동일 클래스에서만 사용가능 
 
 
 static 제어자
 클래스 맴버에서 사용하는 제어자이다. 객체를 생성하지 않고도 '클래스명.멤버명'
 직접 접근하여 사용할수 있다.물론 객체를 생성하고도 사용할수도 있다.  
 
 */

//		B b = new B();
//		System.out.println(b.m);//객체로 접근
//		System.out.println(b.n);//객체로 접근
//		System.out.println(B.n);//클래스로 직접 접근
		
		B b1 = new B();
		B b2 = new B();
		
		b1.m = 5;
		b2.n = 6; //객체마다 고유의 성질을 유지한다. 
		
		System.out.println(b1.m);
		System.out.println(b1.n);
		
		B.n = 7;
		
		System.out.println(b1.m);
		System.out.println(b1.n);
	}

}


class A {
	private int a;
	private String b;
	
	public void abc() {
		a = 5;
	}
}


class B {
	int m = 3;        //객체를 생성한 후에만 사용가능
	static int n = 5; //객체 생성 없이도 사용가능
}